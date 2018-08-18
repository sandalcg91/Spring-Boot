package com.aartek.repository;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.User;

@Repository
@Transactional
public class RegistrationRepository {

	final static Logger log = Logger.getLogger(RegistrationRepository.class);
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void userReg(User user)
	{
		log.info("Registration Repository");
		hibernateTemplate.save(user);
	}
}