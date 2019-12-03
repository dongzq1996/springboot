package com.dzq.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/test")
@RestController
public class controller {

    @RequestMapping(value = "/hi")
    public  String test(){
        return  " hi !";
    }
}
