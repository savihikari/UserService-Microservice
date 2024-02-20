package com.training.org.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.training.org.VO.ResponseTemplateVO;
import com.training.org.entities.User;
import com.training.org.services.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user ) {
		log.info("inside saveUser");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getUserByUserId(@PathVariable("id") long userId ) {
		System.out.println("inside getUserByUserId" + userId);
		log.info("inside getUserByUserId" + userId);
		return userService.getUserWithDepartment(userId);
	}
}

