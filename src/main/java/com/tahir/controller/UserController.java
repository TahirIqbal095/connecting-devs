package com.tahir.controller;

import com.mysql.cj.log.Log;
import com.tahir.model.LoginUser;
import com.tahir.model.User;
import com.tahir.service.UserService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping("/api")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }
    @PostMapping("/login")
    public LoginUser findUser(@RequestBody LoginUser loginUser) {
        return userService.findUser(loginUser);
    }

}
