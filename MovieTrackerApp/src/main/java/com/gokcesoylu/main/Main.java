package com.gokcesoylu.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gokcesoylu.config.AppConfig;
import com.gokcesoylu.model.User;
import com.gokcesoylu.services.LoginService;
import com.gokcesoylu.services.UserService;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user);
        }

        LoginService lg = new LoginService();
        lg.login();

    }
}
