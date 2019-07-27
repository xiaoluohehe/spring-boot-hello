package com.luo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public Map<String,String> hello1(){
        Map<String,String> map=new HashMap<String, String>();
        map.put("aa","aa");
        return map;
    }
}
