package com.arthur.jdk.javaproxy.jdk;

public class UserServiceImpl implements UserService {

	@Override
	public String getUserNameByUserId(Long userId) {
		return "my name is"+userId;
	}

}
