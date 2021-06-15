package com.crs.hotel.exception;

public class ValidationException extends BaseException{
	
	public ValidationException(String errorCode,String errorMessages) {
		super(errorCode,errorMessages);
	}

	public ValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	

}
