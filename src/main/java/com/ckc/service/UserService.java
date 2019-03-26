package com.ckc.service;

import com.ckc.entity.UserEntity;
import com.ckc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	public void addUserInfo(UserEntity userEntity) {
		userMapper.addUserInfo(userEntity);
	}
}
