package com.tahir.profile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "UserProfile")
public class ProfileEntity {
    @Id
    private int id;
    private String name;
    private String bio;
    private String workingAs;
    private String Experience;
    private String socialLinks;
    private String projectLinks;
}
