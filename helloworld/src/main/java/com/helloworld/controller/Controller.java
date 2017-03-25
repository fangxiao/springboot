package com.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fangxiao on 2017/3/24.
 */
@RestController
public class Controller {

    @RequestMapping("/helloworld")
    public String helloWorld() {
        return "helloworld";
    }

    @RequestMapping("/user")
    public Map getUsers() {
        Map map = new HashMap<>();
        map.put("name","fangxiao");
        map.put("age","15");
        return map;
    }
}
