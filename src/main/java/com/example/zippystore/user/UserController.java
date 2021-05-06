package com.example.zippystore.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {

     @RequestMapping(path = "/userlogin")
    public String testMethod(){
        return "Hey Xynee!";
     }
}
