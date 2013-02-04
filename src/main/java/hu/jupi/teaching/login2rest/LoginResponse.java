package hu.jupi.teaching.login2rest;

import java.util.UUID;

public class LoginResponse {

	public static final String ERROR = "ERROR";
			
	private String token;
	private boolean success;
	private String errorMessage;
	
	public static LoginResponse getSuccess() {
		LoginResponse success = new LoginResponse();
		success.success = true;
		success.token = UUID.randomUUID().toString();
		return success;
	}
	
	public static LoginResponse getError(String errorMessage) {
		LoginResponse error = new LoginResponse();
		error.errorMessage = errorMessage;
		error.success = false;
		return error;
	}
	
	public static LoginResponse getError() {
		LoginResponse error = new LoginResponse();
		error.errorMessage = ERROR;
		error.success = false;
		return error;
	}

	public String getToken() {
		return token;
	}

	public boolean isSuccess() {
		return success;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

}
