package com.gokcesoylu.main;

import java.util.ArrayList;
import java.util.List;
import com.gokcesoylu.entity.User;
import com.gokcesoylu.services.UserService;

public class MainClass {
    public static void main(String[] args) {
        UserService userService1 = new UserService();
        List<User> userList = new ArrayList<>();
        userList.add(new User("Gökçe"));
        userList.add(new User("Taha"));

        userService1.setUserList(userList);
    }
}
