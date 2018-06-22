package com.productapp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.productapp.Utils.Constants;
import com.productapp.Utils.UtilityClass;
import com.productapp.databaselayer.RegisterDAO;
import com.productapp.model.RegisterAdminModel;

public class RegisterAdminService {

	
		
	
	public void validateAdmin(RegisterAdminModel registeradminmodel) {
		
		Date comparedate=UtilityClass.convertStringtoDate(Constants.COMPARE_DATE);
				
		if (registeradminmodel.getDateOfJoining().after(comparedate)&&registeradminmodel.getDeptCode().equalsIgnoreCase("Admin")){
			registeradminmodel.setUserActive(Constants.YES_FLAG);
			RegisterDAO registerdao=new RegisterDAO();
			registerdao.registeradmin(registeradminmodel);
			
		}
		
	}

}
