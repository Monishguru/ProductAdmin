package com.productapp.Utils;

public class ExceptionClass extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExceptionClass(String message, String errorCode) {
		super();
		this.message = message;
		this.errorCode = errorCode;
	}

	private String message;
	
	private String errorCode;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	

}
