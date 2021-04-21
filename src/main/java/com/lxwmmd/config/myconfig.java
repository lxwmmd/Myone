package com.lxwmmd.config;

import com.lxwmmd.bean.Pet;
import com.lxwmmd.bean.Staff;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class myconfig {

    @Bean
    public Staff getstaobj(){
        Staff staff = new Staff("小米", 18 );
        staff.setPet(getPetname());
        return staff;
    }
    @Bean("tom")
    public Pet getPetname(){
        return new Pet("tom");
    }




}
