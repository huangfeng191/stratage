package com.fengfeng.strategy.controller;

import com.fengfeng.strategy.entry.User;
import com.fengfeng.strategy.service.UserService;
import com.fengfeng.strategy.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("r")
public class RController {
    @Autowired
    UserService userService;
    @GetMapping("by_id")
    public R getUserNameById(@RequestParam int id){
        return R.ok().put("str" ,userService.getUserNamebyId(id));
    }
    @GetMapping("one/by_id")
    public R selectUser(@RequestParam int id ){
        return R.ok().put("user" ,userService.selectUser(id));

    }
    @GetMapping("one/insert")
    public R insertOne(User user){
        userService.insertUser(user);
        return R.ok();

    }
}
