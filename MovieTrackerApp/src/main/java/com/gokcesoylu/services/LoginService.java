package com.gokcesoylu.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gokcesoylu.config.AppConfig;
import com.gokcesoylu.model.User;

public class LoginService {
    public void login() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        for (User user : userService.getUserList()) {
            System.out.println("miyav " + user);
        }
    }
}
