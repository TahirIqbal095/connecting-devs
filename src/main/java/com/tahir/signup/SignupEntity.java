package com.tahir.signup;

import com.tahir.username.Username;
import com.tahir.username.UsernameEntity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserRegistration")
@Data
@NoArgsConstructor
public class SignupEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username_id")
    private UsernameEntity username;
}
