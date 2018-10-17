package com.chinaunicom.controller;

import com.chinaunicom.Service.*;
import com.chinaunicom.controller.agent.annotation.ApiJsonObject;
import com.chinaunicom.controller.agent.annotation.ApiJsonProperty;
import com.chinaunicom.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Map;

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

    @RequestMapping(value="/map_post",method = RequestMethod.POST )
    //    map类型的body
    @ApiOperation(value = "登陆", tags = "登陆")
    public void auth(@ApiJsonObject(name = "login_model", value = {
        @ApiJsonProperty(key = "mobile", example = "18614242538", description = "user mobile"),
        @ApiJsonProperty(key = "password", example = "123456", description = "user password")
})
        @RequestBody Map<String, String> params) {
            System.out.println("map类型");
            System.out.println("mobile:"+params.get("mobile"));
            System.out.println("password:"+params.get("password"));
        }
}

