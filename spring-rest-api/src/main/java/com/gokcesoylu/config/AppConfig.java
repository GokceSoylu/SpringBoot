package com.gokcesoylu.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gokcesoylu.model.Employee;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1", "Gökçe", "Soylu"));
        employeeList.add(new Employee("2", "Taha", "Özmen"));
        employeeList.add(new Employee("3", "Behice", "Soylu"));
        employeeList.add(new Employee("4", "Sabriye", "Soylu"));
        employeeList.add(new Employee("5", "Hasan", "Sabbah"));

        return employeeList;
    }
}
