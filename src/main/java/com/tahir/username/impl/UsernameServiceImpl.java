package com.tahir.username.impl;

import org.springframework.stereotype.Service;

import com.tahir.username.UsernameEntity;
import com.tahir.username.UsernameRepository;
import com.tahir.username.UsernameService;
@Service
public class UsernameServiceImpl implements UsernameService {

    private final UsernameRepository repository;

    public UsernameServiceImpl(UsernameRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean addUserName(UsernameEntity usernameEntity, int id) {
       UsernameEntity username = repository.findById(id).get();

       if(username != null) {
        repository.save(username);
        return true;
       }
       return false;
    }
}
