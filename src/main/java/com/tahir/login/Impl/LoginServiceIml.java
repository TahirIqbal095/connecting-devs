package com.tahir.login.Impl;

import com.tahir.login.Login;
import com.tahir.login.LoginRepository;
import com.tahir.login.LoginService;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceIml implements LoginService {

    private final LoginRepository repository;

    public LoginServiceIml(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean findUser(Login login) {
        String email = login.getEmail();
        return repository.findByEmail(email) != null;
    }
}

/**
 *
 * GET - SELECT
 * POST - INSERT
 * PUT - UPDATE
 * DELETE - DELETE
 */