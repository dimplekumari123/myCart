package com.moblileCart.dto;

public class UserDto {
	private String userName;
	private String email;
	private Long moblileNo;
	private String password;
	private String confirmPassword;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getMoblileNo() {
		return moblileNo;
	}
	public void setMoblileNo(Long moblileNo) {
		this.moblileNo = moblileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	
}
