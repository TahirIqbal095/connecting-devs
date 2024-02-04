package com.tahir.model;

import lombok.Data;

@Data
public class LoginUser {
    private int userId;
    private String email;
    private String password;
}
