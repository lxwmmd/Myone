package com.lxwmmd.controller;

import com.lxwmmd.bean.Staff;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ParammeterTest {

    //   car/1/owner/zhangsan
    @GetMapping("/car/{id}/ownwe/{username}/list")//  /car?id=1不推荐
    public Map<String ,Object> getCar(@PathVariable("id") Integer id,
                                      @PathVariable("username") String name,
                                      @PathVariable  Map<String ,String> pv,
                                      @RequestHeader("User-Agent") String userhead,
                                      @RequestHeader Map<String,String> head,
                                      @RequestParam Integer age){
        Map<String ,Object> map=new HashMap<>();
        map.put("id",id);
        map.put("name",name);
        map.put("pv",pv);
        map.put("User-Agent",userhead);
        map.put("head",head);
        map.put("age",age);
        return map;
    }

    @PostMapping("/save")
    public Map postMethod(@RequestBody String rbody){
        Map<String ,Object> map=new HashMap<>();
        map.put("rody",rbody);
        return map;
    }

    @GetMapping("/gs")
    public Staff getStaff(){
        Staff staff=new Staff();
        staff.setName("小敏");
        return staff;
    }

}
