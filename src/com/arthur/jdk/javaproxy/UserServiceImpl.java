package com.arthur.jdk.javaproxy;

public class UserServiceImpl implements UserService {

	@Override
	public String getUserNameByUserId(Long userId) {
		return "my name is"+userId;
	}

}
