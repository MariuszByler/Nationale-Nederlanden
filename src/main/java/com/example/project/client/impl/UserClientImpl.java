package com.example.project.client.impl;

import com.example.project.domain.User;
import com.example.project.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class UserClientImpl implements UserClient {

    @Value("${api.url}")
    private String URL;

    private final RestTemplate restTemplate;

    @Autowired
    public UserClientImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public User getUserInfo() {
        return restTemplate.getForObject(URL,User.class);
    }

}
