package com.aartek.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;
import com.aartek.service.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	final static Logger logger = Logger.getLogger(LoginController.class);
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String showLogin(Model model){
		logger.info("Inside controller");
		   logger.info("Inside controller : log");
		   model.addAttribute("userMap", new User());
		   return "login";
	}
	@RequestMapping(value="/userSignIn", method=RequestMethod.POST )
	public String signInAction(@ModelAttribute("userMap")User user){
		String  check = loginService.loginRepoCheck(user.getEmail(), user.getPassword());
		if(check.equals("valid")){
			return "redirect:/product";
		}
		else{
			return "login";
		}
	}
}