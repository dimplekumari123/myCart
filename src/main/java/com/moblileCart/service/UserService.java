package com.moblileCart.service;

import com.moblileCart.dto.UserDto;

public interface UserService {
public String createRegistration(UserDto user);
public UserDto userLogin(String username,String password);

}
