package com.fengfeng.strategy.controller;

import com.fengfeng.strategy.entry.User;
import com.fengfeng.strategy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("by_id")
    public String getUserNameById(@RequestParam int id){
        return userService.getUserNamebyId(id);
    }
    @GetMapping("one/by_id")
    public User selectUser(@RequestParam int id ){
        return userService.selectUser(id);
    }
    @GetMapping("one/insert")
    public void insertOne(User user){
        userService.insertUser(user);
    }
}
