package com.frank.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.frank.demo.domain.User;
@RestController
public class HelloWorldController {
	@Autowired
	User user;
	
	@RequestMapping("/hello")
	public  String index(){
		System.out.println(user.getName()+"-"+user.getPassword());
		return "Hello World1";
	}
/*	@RequestMapping("/user")
	public User user(){
		User user=new  User();
		user.setName("frank");
		user.setPassword("abc");
		return user;
	}*/
}
