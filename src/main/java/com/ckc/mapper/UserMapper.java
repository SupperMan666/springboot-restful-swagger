package com.ckc.mapper;

import com.ckc.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	void addUserInfo(UserEntity userEntity);
}
