package com.sundry.serviceImpl;

import com.sundry.domain.User;
import com.sundry.service.UserService;
import com.sundry.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(List<User> user) {
        userRepository.saveAll(user);
    }

    @Override
    public void unregisterUser(List<User> user) {
        userRepository.deleteAll(user);
    }

    @Override
    public Long userCounts() {
        return userRepository.count();
    }
}
