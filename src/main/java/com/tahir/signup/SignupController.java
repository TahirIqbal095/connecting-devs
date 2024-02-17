package com.tahir.signup;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {
    private final SignupService userService;

    public SignupController(SignupService userService) {
        this.userService = userService;
    }
    @PostMapping("/register")
    public ResponseEntity<HttpStatus> createUser(@RequestBody Signup signup) {
        boolean created = userService.createUser(signup);
        if(created) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
    }

}
