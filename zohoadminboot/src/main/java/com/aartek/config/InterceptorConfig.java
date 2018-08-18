/*package com.aartek.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.aartek.interceptor.SessionInterceptor;

@Configuration
public class InterceptorConfig extends WebMvcConfigurerAdapter{

	@Autowired
	private SessionInterceptor si;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry)
	{
		registry.addInterceptor(si).addPathPatterns("/**").excludePathPatterns("/User/**");
	}
}
*/