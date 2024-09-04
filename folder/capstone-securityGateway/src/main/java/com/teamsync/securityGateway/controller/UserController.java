package com.teamsync.securityGateway.controller;

import com.teamsync.securityGateway.model.Users;
import com.teamsync.securityGateway.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService service;


    @PostMapping("/register")
    public Users register(@RequestBody Users user) {
        return service.register(user);

    }

    @PostMapping("/login")
    public String login(@RequestBody Users user) {
        return service.verify(user);
    }

    @GetMapping("/userdetails/{username}")
    public Users userdetails(@PathVariable String username){
        return service.getuserdetails(username);
    }


}
