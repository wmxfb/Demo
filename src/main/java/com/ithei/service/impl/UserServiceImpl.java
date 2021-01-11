package com.ithei.service.impl;

import com.ithei.entity.User;
import com.ithei.mapper.UserMapper;
import com.ithei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        List<User> users = userMapper.findAll();

        return users;
    }
}
