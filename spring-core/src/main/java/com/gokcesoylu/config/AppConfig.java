package com.gokcesoylu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gokcesoylu.entity.User;
import com.gokcesoylu.services.UserService;

@Configuration
public class AppConfig {

    @Bean
    public UserService userServiceConfig() {
        UserService userService = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("Gökçe", "Soylu", "g123"));
        userList.add(new User("Taha", "Özmen", "t123"));
        userList.add(new User("Tekir", "Soylu", "t123"));
        userList.add(new User("Aslan", "Özmen", "a123"));
        userList.add(new User("Sarman", "Özmen", "s123"));
        userList.add(new User("Pisi", "Soylu", "p123"));

        userService.setUserList(userList);

        return userService;
    }
}
