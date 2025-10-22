package com.security.test.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@PreAuthorize("denyAll()")
public class UserController {


    @GetMapping("/secure")
    public String secure() {
        return "endPoint secured";
    }

    @GetMapping("/notSecured")
    @PreAuthorize("permitAll()")
    public String notSecure() {
        return "endPoint notSecured";
    }
}
