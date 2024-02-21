package com.tahir.signup.impl;

import com.tahir.login.LoginEntity;
import com.tahir.login.LoginRepository;
import com.tahir.signup.Signup;
import com.tahir.signup.SignupEntity;
import com.tahir.signup.SignupRepository;
import com.tahir.signup.SignupService;
import com.tahir.username.UsernameEntity;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class SignupServiceImpl implements SignupService {
    private final SignupRepository signupRepository;
    private final LoginRepository loginRepository;

    public SignupServiceImpl(SignupRepository userRepository, LoginRepository loginRepository) {
        this.signupRepository = userRepository;
        this.loginRepository = loginRepository;
    }

    @Override
    public boolean createUser(Signup signup) {
        if(signup != null) {
            SignupEntity signupEntity = new SignupEntity();
            LoginEntity loginEntity = new LoginEntity();

            BeanUtils.copyProperties(signup, signupEntity);

            loginEntity.setEmail(signupEntity.getEmail());
            loginEntity.setPassword(signupEntity.getPassword());
            signupRepository.save(signupEntity);
            loginRepository.save(loginEntity);

            return true;
        }
        return false;
    }
}
