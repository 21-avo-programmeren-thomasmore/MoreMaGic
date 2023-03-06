package com.mmg.moremagic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/say-hello")
    public String SayHello(){
        return "hello";
    }

}
