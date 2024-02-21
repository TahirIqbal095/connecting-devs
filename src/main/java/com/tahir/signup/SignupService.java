package com.tahir.signup;

import java.util.List;

public interface SignupService {
    boolean createUser(Signup signup);

    List<Signup> getAllUsers();
}