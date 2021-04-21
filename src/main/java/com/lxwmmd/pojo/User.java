package com.lxwmmd.pojo;

import com.lxwmmd.mapper.UserMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User  {
    private int id;
    private String name;


}
