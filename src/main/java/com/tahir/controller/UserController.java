package com.tahir.controller;

import com.tahir.model.LoginUser;
import com.tahir.model.User;
import com.tahir.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:63342")
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
    public ResponseEntity<String> findUser(@RequestBody LoginUser user) {
        return userService.findUser(user);
    }
}
