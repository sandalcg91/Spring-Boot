package com.aartek.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.service.RegistrationService;

@Controller
public class RegistrationController {
	@Autowired
	private RegistrationService registrationService;
	final static Logger log = Logger.getLogger(RegistrationController.class);
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String userReg(Model model)
	{
		log.info("Registration Controller : Get");
		model.addAttribute("userReg", new User());
		return "registration";
	}
	
	@RequestMapping(value="/userSignUp", method=RequestMethod.POST)
	public String userSignUp(@ModelAttribute("userReg") User user)
	{
		log.info("Registration Controller : Post");
		log.info(user.getEmail()+" "+user.getPassword());
		registrationService.userReg(user);
		return "Hello";
	}
}