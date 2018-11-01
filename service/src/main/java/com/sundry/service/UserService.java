package com.sundry.service;

import com.sundry.domain.User;

import java.util.List;


public interface UserService {

    void registerUser(List<User> user);
    void unregisterUser(List<User> user);
    Long userCounts();
}
