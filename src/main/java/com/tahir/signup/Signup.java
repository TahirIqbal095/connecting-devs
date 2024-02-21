package com.tahir.signup;

import com.tahir.username.Username;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "UserRegistration")
@Data
@NoArgsConstructor
public class Signup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username_id")
    private Username username;
}
