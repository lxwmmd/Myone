package com.lxwmmd.service.impl;

import com.lxwmmd.mapper.UserMapper;
import com.lxwmmd.pojo.User;
import com.lxwmmd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl  implements UserService {

    @Autowired
   private UserMapper userMapper;


    @Override
    public User queryById(int id) {
        return userMapper.queryById(id);
    }

    @Override
    public List<User> queryUserList() {
        return userMapper.queryUserList();
    }
}
