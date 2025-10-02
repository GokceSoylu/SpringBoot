package com.gokcesoylu.config;

import java.util.List;
import java.util.ArrayList;
import com.gokcesoylu.model.Employee;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public List<Employee> employeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("1", "Gökçe", "Soylu"));
        employees.add(new Employee("2", "Taha", "Özmen"));
        employees.add(new Employee("3", "Naim", "Özmen"));
        employees.add(new Employee("4", "Aslan", "Soylu"));
        employees.add(new Employee("5", "Pisi", "Soylu"));
        return employees;
    }

}
