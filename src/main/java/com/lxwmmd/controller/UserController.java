package com.lxwmmd.controller;

import com.lxwmmd.mapper.UserMapper;
import com.lxwmmd.pojo.User;
import com.lxwmmd.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {



       @Autowired
      public UserMapper userMapper;

    @Autowired
     public    UserService userService;


//    @GetMapping("/checkuser/{id}")
//    public User queryUseId(@PathVariable("id") int id){
//        System.out.println("id = " + id);
//        return userMapper.queryById(id);
//
//    }



    @GetMapping("/fu")
    public List<User> queryUserList(){
       return userService.queryUserList();
    }

    @GetMapping("/fus")
    public List<User> queryUserLista(){
        return userMapper.queryUserList();
    }
}
