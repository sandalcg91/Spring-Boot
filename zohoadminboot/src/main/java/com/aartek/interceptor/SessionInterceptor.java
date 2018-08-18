/*package com.aartek.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.aartek.repository.LoginRepository;
import com.aartek.service.LoginService;

@Component
public class SessionInterceptor implements HandlerInterceptor{
	
	@Autowired
	private LoginRepository loginrepository;

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception 
	{
		System.out.println("Inside Session : afterCompletion");
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception 
	{
		System.out.println("Inside Session : postHandle");
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception 
	{
		
		System.out.println("In preHandle we are Intercepting Request");
		System.out.println("____________________________________________");
		String requestURI = request.getRequestURI();
		
		String email = request.getHeader("email");
		String password = request.getHeader("password");
		
		System.out.println("RequestURI::" + requestURI + " || Search with EmailID ::" + email);
		System.out.println("RequestURI::" + requestURI + " || Search with Password ::" + password);
		System.out.println("____________________________________________");
		
		Boolean status = loginrepository.loginRepoCheck(email,password);
		
		if(status==false)
		{
			return false;
		}
		return true;
	}

	
	
}
*/