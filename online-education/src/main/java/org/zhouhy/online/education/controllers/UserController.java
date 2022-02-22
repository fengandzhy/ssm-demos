package org.zhouhy.online.education.controllers;

import org.springframework.web.bind.annotation.*;
import org.zhouhy.online.education.domains.User;
import org.zhouhy.online.education.services.UserService;
import org.zhouhy.online.education.utils.JsonData;

@RestController
@RequestMapping("api/v1/pub/user")
public class UserController {

    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 登录接口   
     */
    @PostMapping("login")
    public JsonData login(@RequestBody User user){
        System.out.println("user=" + user.toString());
        String token = userService.login(user.getUsername(), user.getPwd());
        return token !=null ? JsonData.buildSuccess(token) : JsonData.buildError("账号密码错误");
    }
    
    /**
     * 列出全部用户     
     */
    @GetMapping("list")
    public JsonData listUser(){
        return  JsonData.buildSuccess(userService.listUser());
    }
}
