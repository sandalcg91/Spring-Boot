package com.aartek.repository.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.aartek.model.User;
import com.aartek.repository.LoginRepository;

import mockit.Mock;
import mockit.MockUp;

public class JunitTestLoginRepo {

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
	}
	
	@Test
	public void testCheckLogin() {
		User user = new User();
		LoginRepository lr = new LoginRepository();
		String check = lr.loginRepoCheck(user.getEmail(), user.getPassword());
		System.out.println("----------"+check);
		assertEquals("String Returned", "Valid", check);
	}
}