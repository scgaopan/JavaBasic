package com.arthur.jdk.javaproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor{

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		 System.out.println("----执行方法前的方法 " + proxy.getSuperName() + "------"); 
		 
		 Object result=proxy.invokeSuper(obj, args);
		 
		 System.out.println("----执行方法后的方法 " + proxy.getSuperName() + "------"); 
		
		return result;
	}

}
