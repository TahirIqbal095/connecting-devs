package com.tahir.service;

import com.tahir.entity.UserEntity;
import com.tahir.model.LoginUser;
import com.tahir.model.User;
import com.tahir.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(user, userEntity);
        userRepository.save(userEntity);
        return user;
    }

    @Override
    public ResponseEntity<String> findUser(@RequestBody LoginUser user) {
        UserEntity ue = userRepository.findByEmail(user.getEmail());

        if (ue != null && ue.getPassword().equals(user.getPassword())) {
            return ResponseEntity.ok("login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("invalid username and password");
        }
    }
}
