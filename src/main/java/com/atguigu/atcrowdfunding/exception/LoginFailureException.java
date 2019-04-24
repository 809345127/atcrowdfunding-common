package com.atguigu.atcrowdfunding.exception;

@SuppressWarnings("serial")
public class LoginFailureException extends RuntimeException {

	public LoginFailureException() {}
	
	public LoginFailureException(String message) {
		super(message);
	}
	
}
