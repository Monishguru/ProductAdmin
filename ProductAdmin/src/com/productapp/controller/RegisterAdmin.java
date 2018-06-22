package com.productapp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.productapp.Utils.UtilityClass;
import com.productapp.model.RegisterAdminModel;
import com.productapp.service.RegisterAdminService;

@WebServlet(description = "Servlet to Register Admin user", urlPatterns = { "/RegisterAdmin" })
public class RegisterAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	public RegisterAdmin() {
		super();
		System.out.println("My Constructor is invoked first and will move to either doGet or doPost");
            
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Enter the Get Request Method");
					
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		System.out.println("Session Id :"+session.getId()+"Enter the Get Request Method");
		
		
		RegisterAdminModel registeradminmodel=new RegisterAdminModel();
		
		registeradminmodel.setEmployeeId(Integer.parseInt(request.getParameter("employeeId")));
		registeradminmodel.setEmployeeName(request.getParameter("employeeName"));
		registeradminmodel.setPassword(request.getParameter("password"));
		registeradminmodel.setDeptCode(request.getParameter("deptCode"));
		
		String date=request.getParameter("dateOfJoining");
		System.out.println("Date in the format of String from form is "+date);
		
		registeradminmodel.setDateOfJoining(UtilityClass.convertStringtoDate(date));
		
		
		RegisterAdminService registeradminservice=new RegisterAdminService();
		registeradminservice.validateAdmin(registeradminmodel);
		
		
		
		
		
	}

}
