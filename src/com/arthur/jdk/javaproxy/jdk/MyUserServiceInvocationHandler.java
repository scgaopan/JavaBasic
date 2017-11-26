package com.arthur.jdk.javaproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyUserServiceInvocationHandler implements InvocationHandler{

	private Object targetObject;
	
	public MyUserServiceInvocationHandler(Object targetObject){
		this.targetObject=targetObject;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		if("getUserNameByUserId".equals(method.getName())){
			System.out.println("----------这是在"+method.getName()+"方法之前执行的业务逻辑----------");
			Object result=method.invoke(targetObject, args);
			System.out.println("-------这是执行完操作后的返回结果="+result+"--------");
			System.out.println("----------这是在"+method.getName()+"方法之后执行的业务逻辑----------");
			return result;
		}
		return null;
	}
	

}
