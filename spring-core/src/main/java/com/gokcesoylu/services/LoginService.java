package com.gokcesoylu.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gokcesoylu.entity.User;
import com.gokcesoylu.config.AppConfig;

public class LoginService {
    public void login() {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);
        for (User user : userService.getUserList()) {
            if (user.getLastname().equals("Özmen"))
                System.out.println(user);
        }
    }

}
