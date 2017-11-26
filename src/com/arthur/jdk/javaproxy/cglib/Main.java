package com.arthur.jdk.javaproxy.cglib;

import com.arthur.jdk.javaproxy.UserService;
import com.arthur.jdk.javaproxy.UserServiceImpl;

import net.sf.cglib.proxy.Enhancer;

public class Main {
	
	public static void main(String[] args) {
		CglibProxy cglibProxy = new CglibProxy();  
		Enhancer enhancer=new Enhancer();
		enhancer.setSuperclass(UserServiceImpl.class);
		enhancer.setCallback(cglibProxy);
		
		UserService userService=(UserService)enhancer.create();
		userService.getUserNameByUserId(123L);
		
	}

}
