package com.tahir.username;

import com.tahir.signup.Signup;
import com.tahir.signup.SignupEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "Usernames")
public class UsernameEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;

    @OneToOne(mappedBy = "username")
    private SignupEntity signup;
}