package com.moblileCart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moblileCart.dto.UserDto;
import com.moblileCart.service.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/registration")
	public ResponseEntity<String> createRegistration(@RequestBody UserDto user) {

		String msg = userServiceImpl.createRegistration(user);

		return new ResponseEntity<String>(msg, HttpStatus.OK);

	}
	@PostMapping("/login")
	public ResponseEntity<UserDto> userLogin(@RequestBody UserDto userdto ){
		UserDto user=userServiceImpl.userLogin(userdto.getUserName(), userdto.getPassword());
		return new ResponseEntity<UserDto> (user,HttpStatus.OK);
	}
}
