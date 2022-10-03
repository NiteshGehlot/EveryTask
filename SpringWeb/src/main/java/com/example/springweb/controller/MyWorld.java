package com.example.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class MyWorld {


    @RequestMapping(value = "/world",method = RequestMethod.GET)
    @ResponseBody
    public String world(){
        return "My Beautiful World";
    }


    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public String getData(){
        return "Data from Server";
    }
}
