package com.example.controller;

import org.example.domin.User;
import org.example.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/insert")
    public int insertUser(){
        User user = new User();
        user.setId("10021");
        user.setName("zhangsan");
        user.setAge(19);
        user.setWorkMes("清洁工");
        int n = userService.insertUser(user);
        return n;
    }

    @RequestMapping(value = "/findAll")
    public List<User> selectAllUser(){
        List<User> listu = userService.selectAllUser();
        return listu;
    }
}
