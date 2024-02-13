package com.tahir.signup.impl;

import com.tahir.signup.Signup;
import com.tahir.signup.SignupEntity;
import com.tahir.signup.SignupRepository;
import com.tahir.signup.SignupService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements SignupService {
    private final SignupRepository userRepository;

    public UserServiceImpl(SignupRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean createUser(Signup signup) {
        if(signup != null) {
            SignupEntity userEntity = new SignupEntity();
            BeanUtils.copyProperties(signup, userEntity);
            userRepository.save(userEntity);
            return true;
        }
        return false;
    }
}
