package com.spring.projects.airBnbApp.service;

import com.spring.projects.airBnbApp.dto.ProfileUpdateRequestDto;
import com.spring.projects.airBnbApp.dto.UserDto;
import com.spring.projects.airBnbApp.entity.User;

public interface UserService {
    User getUserById(Long id);

    void updateProfile(ProfileUpdateRequestDto profileUpdateRequestDto);

    UserDto getMyProfile();
}
