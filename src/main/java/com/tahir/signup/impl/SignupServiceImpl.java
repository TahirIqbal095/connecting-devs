package com.tahir.signup.impl;

import com.tahir.login.Login;
import com.tahir.login.LoginRepository;
import com.tahir.signup.Signup;
import com.tahir.signup.SignupRepository;
import com.tahir.signup.SignupService;

import java.util.List;

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
            Signup signupEntity = new Signup();
            Login loginEntity = new Login();

            BeanUtils.copyProperties(signup, signupEntity);

            loginEntity.setEmail(signupEntity.getEmail());
            loginEntity.setPassword(signupEntity.getPassword());
            signupRepository.save(signupEntity);
            loginRepository.save(loginEntity);

            return true;
        }
        return false;
    }

    @Override
    public List<Signup> getAllUsers() {
        return signupRepository.findAll();
    }
}
