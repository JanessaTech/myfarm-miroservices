package com.myfarm.auth2;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class HelloController {
    @RequestMapping("/test1")
    @PreAuthorize("hasAuthority('admin')")
    public ResponseEntity<String> test1() {
        return ResponseEntity.ok().body("admin success!");
    }
    @RequestMapping("/test2")
    @PreAuthorize("hasAuthority('admin')")
    public ResponseEntity<String> test2() {
        return ResponseEntity.ok().body("admin success!");
    }

    @RequestMapping("/test3")
    @PreAuthorize("hasAuthority('client')")
    public ResponseEntity<String> test3() {
        return ResponseEntity.ok().body("client success!");
    }

    @GetMapping("/getCurrentUser")
    public Object getCurrentUser(Authentication authentication) {
        return authentication;
    }

}