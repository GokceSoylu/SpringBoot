package com.gokcesoylu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.gokcesoylu.entity.User;
import com.gokcesoylu.config.AppConfig;
import com.gokcesoylu.services.UserService;

public class MainClass {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user.getFirstname());
        }
    }
}
// option + shift + o ile kullanılmayan paketleri silebilirsin :))