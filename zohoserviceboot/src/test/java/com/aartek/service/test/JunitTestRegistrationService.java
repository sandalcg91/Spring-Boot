package com.aartek.service.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.aartek.model.User;
import com.aartek.repository.RegistrationRepository;
import com.aartek.service.RegistrationService;

import mockit.Mock;
import mockit.MockUp;

public class JunitTestRegistrationService {

	@Before
	public void setup() {
		new MockUp<User>() {
			
			@Mock
			String getFirstname() {
				return "chandan";
			}
			
			@Mock
			String getLastname() {
				return "gupta";
			}
			
			@Mock
			String getEmail() {
				return "sandal@gmail.com";
			}
			
			@Mock
			String getPassword() {
				return "789";
			}
		};
		
		new MockUp<RegistrationRepository>() {
			@Mock
			void registrationRepository(User user) {
				System.out.println("Success");
			}
		};
		
		new MockUp<RegistrationService>() {
			@Mock
			void registrationService(User user) {
				System.out.println("success");
			}
		};
	}
	@Test
	public void testCheckServiceRegistration() {
		User user = new User();
		
		RegistrationService rs = new RegistrationService();
		String fn = user.getFirstname();
		String ln = user.getLastname();
		String em = user.getEmail();
		String pwd = user.getPassword();
		
		assertEquals("First Name Returned", "chandan", fn);
		assertEquals("Last Name Returned", "gupta", ln);
		assertEquals("Email Returned", "sandal@gmail.com", em);
		assertEquals("Password Returned", "789", pwd);
	}
}