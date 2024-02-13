package com.tahir.login.Impl;

import com.tahir.login.LoginEntity;
import com.tahir.login.LoginRepo;
import com.tahir.login.LoginService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class LoginServiceIml implements LoginService {

    private final LoginRepo repo;

    public LoginServiceIml(LoginRepo repo) {
        this.repo = repo;
    }
}
