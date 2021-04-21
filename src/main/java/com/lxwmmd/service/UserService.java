package com.lxwmmd.service;

import com.lxwmmd.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {

//    @Autowired
//   UserMapper userMapper ;
//
//
//    public User queryById(int id){
//
//       return userMapper.queryById(id);
//
//    }

    public User queryById(int id);
    public  List<User> queryUserList();
}
