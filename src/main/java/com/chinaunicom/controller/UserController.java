package com.chinaunicom.controller;

import com.chinaunicom.Service.*;
import com.chinaunicom.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

@RestController
@Validated
//用在类上，说明类的作用
@Api(value = "USER", description = "测试UserController")
public class UserController {
    @Resource
    private UserService UserService;

    @RequestMapping(value="/hello",method = RequestMethod.GET )
//    用在方法上，说明方法的作用
    @ApiOperation(value = "查询个人信息接口",notes = "查询个人信息接口")

    public User say(@RequestParam("id") int id){
        return UserService.selectById(id);
    }
}

