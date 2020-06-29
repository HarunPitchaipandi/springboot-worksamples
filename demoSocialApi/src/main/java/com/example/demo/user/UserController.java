package com.example.demo.user;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
	  
	  @Autowired
	  private UserService UserService;
	
	   @RequestMapping(value="/users")
	   public List<User> getAllUsers() {

		   return UserService.getAllUsers();
	   }
	   
	   @RequestMapping(value="/users/{id}")
	   public User getUser(@PathVariable String id) {
		   return UserService.getUser(id);
	   }
	   
	   @RequestMapping(value="/users", method=RequestMethod.POST)
	   public void addUser(@RequestBody User user) {
		   UserService.addUser(user);
		   
	   }
	}