package com.security.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("auth")
public class UserController {


    @GetMapping("/secure")
    public String secure() {
        return "endPoint secured";
    }

    @GetMapping("/notSecured")
    public String notSecure() {
        return "endPoint notSecured";
    }
}
