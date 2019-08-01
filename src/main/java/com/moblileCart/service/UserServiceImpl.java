package com.moblileCart.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moblileCart.dto.UserDto;
import com.moblileCart.entity.UserEntity;
import com.moblileCart.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
	@Override
	public String createRegistration(UserDto user) {
		UserEntity user1=new UserEntity();
		if(user.getPassword().equals(user.getConfirmPassword())) {
		
		BeanUtils.copyProperties(user, user1);
		userRepository.save(user1);
		
		}
		else
		{
			// throw new passwordNotMatch()
			return "failed";
		}
		
		return "registration is successfully complited";
	}

}
