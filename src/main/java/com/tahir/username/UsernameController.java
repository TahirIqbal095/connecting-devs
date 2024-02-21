package com.tahir.username;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsernameController {

    private final UsernameService service;

    public UsernameController(UsernameService service) {
        this.service = service;
    }


    @PutMapping("/register/{id}")
    public ResponseEntity<HttpStatus> addUserName(@RequestBody UsernameEntity username, @PathVariable int id) {
        boolean added = service.addUserName(username, id);

        if(added) {
            return new ResponseEntity<>(HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.FOUND);
        }
    }
}
