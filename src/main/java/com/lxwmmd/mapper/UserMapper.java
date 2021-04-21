package com.lxwmmd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lxwmmd.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;


@Repository
@Mapper
public interface UserMapper  {
//extends BaseMapper<User>

  //@Select("select * from user")


    List<User> queryUserList();

    User queryById(int id);

    int addUser(User user);
    int updateUser(User user);
    int dalUser(int id);

}
