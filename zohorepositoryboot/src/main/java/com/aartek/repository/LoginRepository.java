package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.User;

@Repository
@Transactional
public class LoginRepository {

	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	final static Logger logger = Logger.getLogger(LoginRepository.class);
	public String checkLogin(User login)
	{
		logger.debug("Inside Repository : Login");
		
		logger.debug(login.getEmail());
		logger.debug(login.getPassword());
		hibernatetemplate.save(login);
		return "user";
	}
	public String loginRepoCheck(String email,String password)
	{
		logger.info("Inside LoginRepository : loginRepoCheck() ");
		List list = hibernatetemplate.find("from User u where u.email=? and u.password=?", email, password);
		Iterator itr = list.iterator();
		String email1=null;
		String pwd1 = null;
		String check = null;
		while(itr.hasNext()) {
			User u = (User)itr.next();
			email1 = u.getEmail();
			pwd1 = u.getPassword();
		}
		if(email.equals(email1) && password.equals(pwd1))
		{
			logger.info(email+"Login Successfully");
			check = "valid";
		}
		else
		{
			logger.info("Invalid email and password");
			check = "not valid";
		}
		logger.info(check);
		return check;
	}
}