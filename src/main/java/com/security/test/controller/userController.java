package com.security.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("s1")
public class userController {

    @GetMapping("/index")
    public String index() {
        return "endPoint secured";
    }
}
