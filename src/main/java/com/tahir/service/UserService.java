package com.tahir.service;

import com.tahir.model.LoginUser;
import com.tahir.model.User;

public interface UserService {

    User createUser(User user);

    LoginUser findUser(LoginUser loginUser);
}