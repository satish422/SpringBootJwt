package com.neosoft.springbootjwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.springbootjwt.model.ApiResponse;
import com.neosoft.springbootjwt.model.User;
import com.neosoft.springbootjwt.model.UserDto;
import com.neosoft.springbootjwt.service.UserService;

@RestController
public class RegisterController {
	
	@Autowired
    private UserService userService;
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
    public ApiResponse<User> saveUser(@RequestBody UserDto user){
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }

}
