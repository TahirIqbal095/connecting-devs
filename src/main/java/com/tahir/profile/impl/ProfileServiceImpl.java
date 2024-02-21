package com.tahir.profile.impl;

import org.springframework.stereotype.Service;

import com.tahir.profile.Profile;
import com.tahir.profile.ProfileRepository;
import com.tahir.profile.ProfileService;

@Service
public class ProfileServiceImpl implements ProfileService {
    private ProfileRepository repository;

    public ProfileServiceImpl(ProfileRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean addProfile(Profile profile) {
        return false;
    }
}
