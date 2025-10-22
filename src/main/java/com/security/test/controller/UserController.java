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
    @PreAuthorize("hasAuthority('READ')")
    public String secure() {
        return "EndPoint secured";
    }

    @GetMapping("/not-secured")
    @PreAuthorize("permitAll()")
    public String notSecure() {
        return "EndPoint notSecured";
    }

    @GetMapping("/secure-test")
    @PreAuthorize("hasAuthority('CREATE')")
    public String secureTest() {
        return "Endpoint Test";
    }
}
