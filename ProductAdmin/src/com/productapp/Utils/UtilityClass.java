package com.productapp.Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class UtilityClass {
	
	public static Date convertStringtoDate(String date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date parseddate=null;
		 try {
			 parseddate = formatter.parse(date);
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return parseddate;	
	}

}
