package com.tahir.username.impl;

import org.springframework.stereotype.Service;

import com.tahir.signup.Signup;
import com.tahir.username.Username;
import com.tahir.username.UsernameRepository;
import com.tahir.username.UsernameService;
@Service
public class UsernameServiceImpl implements UsernameService {

    private final UsernameRepository repository;

    public UsernameServiceImpl(UsernameRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean addUserName(Username username, int id) {
       Username un = repository.findByUsername(username.getUsername());
       if(un != null) {
        return false;
       }

       repository.save(username);
       return true;
    }
}
