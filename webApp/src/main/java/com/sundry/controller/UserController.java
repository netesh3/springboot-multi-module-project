package com.sundry.controller;

import com.sundry.domain.User;
import com.sundry.repository.UserRepository;
import com.sundry.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@EnableAutoConfiguration
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<User> sayHello(){
        List users = userRepository.findAll();
        return users;
    }

    @PostMapping("/registrations")
    public void userRegistrations(@RequestBody List<User> user){
        try {
            userService.registerUser(user);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

    @PostMapping("/deregistrations")
    public void userDeRegistrations(@RequestBody List<User> user){
        try {
            userService.unregisterUser(user);
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }

    @GetMapping("countusers")
    public List<Long> userCounts(){
        List counts = Collections.singletonList(userService.userCounts());
        for(var user = 0;user<counts.size();user++){
            System.out.println(user);
        }
        return counts;
    }
}
