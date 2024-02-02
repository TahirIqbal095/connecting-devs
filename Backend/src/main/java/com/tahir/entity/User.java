package com.tahir.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "registered_users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;

    private String name;
    private String about;
    private String birthDate;

    public User() {

    }

    public User(String name, String about, String birthDate) {
        this.name = name;
        this.about = about;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", about='" + about + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
