package com.ckc.controller;

import com.ckc.entity.UserEntity;
import com.ckc.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:ckc
 * 测试
 */
@RestController
@RequestMapping("api")
public class UserController {
	@Autowired
	private UserService userService;
	@ApiOperation(value="测试用接口", notes="测试用接口" ,httpMethod="POST")
	@ApiImplicitParams({
			@ApiImplicitParam(name="name", value="用户姓名", dataType = "String", required=true, paramType="form"),
			@ApiImplicitParam(name="id", value="id", dataType = "int", required=false, paramType="form")
	})
	@RequestMapping("/word")
	public String HelloWord(String name,Integer id) {
		return "Hello Word";
	}

	@PostMapping("/userInfo")
	@ApiOperation(value = "增加",notes = "插入一条用户信息")
	public ResponseEntity<UserEntity> addUserInfo(@RequestBody UserEntity userEntity){
		userService.addUserInfo(userEntity);
		return new ResponseEntity<UserEntity>(userEntity, HttpStatus.OK);
	}



}
