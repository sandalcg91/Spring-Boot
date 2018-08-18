package com.aartek.repository.test;

import org.junit.Before;

import com.aartek.model.User;

import mockit.Mock;
import mockit.MockUp;

public class JunitTestRegistrationRepository {

	@Before
	public void setup() {
		new MockUp<User>() {
			@Mock
			String getEmail() {
				return "sandal@gmail.com";
			}
		};
		
	}
}
