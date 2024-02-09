package com.tahir.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "registered_users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String name;
    private String email;
    private String password;

    public UserEntity() {

    }

    public UserEntity(String name, String email, String password) {
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
