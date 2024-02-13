package com.tahir.signup;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "UserRegistration")
@Data
public class SignupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String email;
    private String password;

    public SignupEntity() {

    }

    public SignupEntity(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", about='" + email + '\'' +
                ", birthDate=" + password +
                '}';
    }
}
