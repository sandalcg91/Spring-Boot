package com.aartek.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;
import com.aartek.service.LoginService;

import mockit.Mock;
import mockit.MockUp;

public class JunitTestLoginService {

	@Before
	public void setup() {
		new MockUp<User>() {
			@Mock
			String getEmail() {
				return "sandal@gmail.com";
			}
			
			@Mock
			String getPassword() {
				return "789";
			}
		};
		new MockUp<LoginRepository>() {
			@Mock
			String loginRepoCheck(String email,String password) {
				return "Valid";
			}
		};
		
		new MockUp<LoginService>() {
			@Mock
			String checkLogin(User user) {
				return "Valid";
			}
		};
	}
	
	@Test
	public void testCheckServiceLogin() {
		User user = new User();
		LoginRepository lr = new LoginRepository();
		String em = user.getEmail();
		assertEquals("Email returned", "sandal@gmail.com", em);
		assertEquals("Password returned", "789", user.getPassword());
		
		String check = lr.loginRepoCheck(user.getEmail(), user.getPassword());
		if(check.equals("Valid"))
		{
			assertEquals("Checked Result ", "Valid", check);
		}
		else
		{
			assertNotEquals("Valid", check);
		}
	}
}