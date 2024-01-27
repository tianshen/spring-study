package com.example.study.service;

import com.example.study.entity.User;
import com.example.study.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    UserMapper userMapper;

    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    public User selectUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

}