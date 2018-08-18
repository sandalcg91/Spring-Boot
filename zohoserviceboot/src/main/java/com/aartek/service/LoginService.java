package com.aartek.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;


@Service
public class LoginService {
	@Autowired
	private LoginRepository loginrepository; 
	
	final static Logger logger = Logger.getLogger(LoginService.class);

	public String checkLogin(User login)
	{
		logger.warn("Inside Service : Login");
		logger.warn(login.getEmail());
		logger.warn(login.getPassword());
		loginrepository.checkLogin(login);
		return "hello";
	}
	
	public String loginRepoCheck(String email,String password)
	{
		logger.info("Inside LoginRepository : loginRepoCheck() ");
		String check = loginrepository.loginRepoCheck(email, password);
		if(check.equals("Valid"))
		{
			return check;
		}
		else
		{
			return check;
		}
	}
}