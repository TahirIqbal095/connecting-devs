package com.tahir.login;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "UserAccounts")
public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int loginId;

    private String email;
    private String password;
}
