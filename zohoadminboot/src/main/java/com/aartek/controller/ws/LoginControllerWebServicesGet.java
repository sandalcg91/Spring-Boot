package com.aartek.controller.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aartek.model.User;
import com.aartek.service.LoginService;

@Controller
public class LoginControllerWebServicesGet {
	
	@Autowired
	private LoginService loginservice;

	@RequestMapping(method=RequestMethod.GET,value="/User/{email}/{password}")
	@ResponseBody
	public User getUserDetails(@PathVariable String email,@PathVariable String password)
	{
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		//user.getEmail();
		System.out.println("Inside Get Method :");
		System.out.println(email + user.getEmail());
		System.out.println(password + user.getPassword());
		return user;
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/User")
	@ResponseBody
	public User setUserDetails(@RequestBody User user)
	{
		System.out.println("Inside Post Method :");
		System.out.println("Email ID : "+user.getEmail());
		System.out.println("Password : "+user.getPassword());
		
		loginservice.checkLogin(user);
		
		return user;
	}
}
