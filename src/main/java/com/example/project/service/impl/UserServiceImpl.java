package com.example.project.service.impl;

import com.example.project.domain.User;
import com.example.project.client.UserClient;
import com.example.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserClient userClient;

    @Autowired
    public UserServiceImpl(UserClient userClient){
        this.userClient = userClient;
    }

    @Override
    public User getUserInfo() {
        User user = userClient.getUserInfo();
        user.setCalculations(calculate());
        return user;
    }

    private double calculate(){
        return 6/2*(2+1);
    }

}
