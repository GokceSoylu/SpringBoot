package com.gokcesoylu.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import com.gokcesoylu.entity.User;
import com.gokcesoylu.config.AppConfig;
import com.gokcesoylu.services.UserService;
import com.gokcesoylu.services.LoginService;

public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = context.getBean(UserService.class);

        for (User user : userService.getUserList()) {
            System.out.println(user.getFirstname());
        }
        System.out.println("login");
        LoginService loginService = new LoginService();
        loginService.login();
    }
}
// option + shift + o ile kullanılmayan paketleri silebilirsin :))