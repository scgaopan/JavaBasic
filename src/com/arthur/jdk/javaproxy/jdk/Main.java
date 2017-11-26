package com.arthur.jdk.javaproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {
	
	public static void main(String[] args) {
		
		UserService userService=new UserServiceImpl();
		InvocationHandler invocationHandler=new MyUserServiceInvocationHandler(userService);
		UserService userPorxy=(UserService) Proxy.newProxyInstance(UserService.class.getClassLoader(),
				new Class[]{UserService.class}, invocationHandler);
		userPorxy.getUserNameByUserId(123L);
	}

}
