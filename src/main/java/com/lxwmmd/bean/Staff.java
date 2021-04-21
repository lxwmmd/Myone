package com.lxwmmd.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {

    private String name;
    private Integer age;
    private Pet pet;

    public Staff(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

}
