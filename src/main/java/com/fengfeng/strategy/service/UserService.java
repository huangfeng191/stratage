package com.fengfeng.strategy.service;

import com.fengfeng.strategy.entry.User;
import com.fengfeng.strategy.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public String getUserNamebyId(int id){
        return userMapper.getNameById(id);
    }
    public User selectUser(int id ){
        return userMapper.selectUser(id);
    }
    public void insertUser(User user){
        userMapper.inertUser(user);
    }
}
