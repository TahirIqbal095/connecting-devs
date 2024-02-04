package com.tahir.service;

import com.tahir.model.LoginUser;
import com.tahir.model.User;
import org.springframework.http.ResponseEntity;

public interface UserService {

    User createUser(User user);

    ResponseEntity<String> findUser(LoginUser user);
}