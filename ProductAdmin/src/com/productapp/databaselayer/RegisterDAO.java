package com.productapp.databaselayer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.productapp.Utils.DatabaseConnection;
import com.productapp.model.RegisterAdminModel;

public class RegisterDAO {

	
	public int registeradmin(RegisterAdminModel registeradminmodel) {
		
		String registerQuery="Insert into Admin_Table (Employee_id,Employee_name,Department_Code,Password,DOJ,User_Active) values ('"+registeradminmodel.getEmployeeId()+"','"+registeradminmodel.getEmployeeName()+"','"+registeradminmodel.getDeptCode()+"','"+registeradminmodel.getPassword()+"','"+registeradminmodel.getUserActive()+"');";
				
		Connection con=DatabaseConnection.getDBConnection();
		int adminaddedFlag=DatabaseConnection.executeQuerytoUpdate(con, registerQuery);
		
		return adminaddedFlag;
	}
}
