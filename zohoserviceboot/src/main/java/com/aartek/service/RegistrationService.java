package com.aartek.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;
	
	final static Logger log = Logger.getLogger(RegistrationService.class);
	
	public void userReg(User user)
	{
		log.info("Registration Service");
		registrationRepository.userReg(user);
		
	}
}