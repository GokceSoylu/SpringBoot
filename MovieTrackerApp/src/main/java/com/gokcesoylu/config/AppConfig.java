package com.gokcesoylu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gokcesoylu.model.User;
import com.gokcesoylu.services.UserService;

@Configuration
public class AppConfig {

    @Bean
    public UserService userService() {
        UserService userService = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("Gökçe"));
        userList.add(new User("Karaca"));
        userService.setUserList(userList);
        return userService;
    }
}
