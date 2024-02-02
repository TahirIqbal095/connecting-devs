package com.tahir.service;

import com.tahir.entity.User;
import com.tahir.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
