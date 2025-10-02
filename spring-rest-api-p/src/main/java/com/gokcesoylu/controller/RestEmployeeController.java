package com.gokcesoylu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.model.Employee;
import com.gokcesoylu.services.EmployeeService;

@RestController
@RequestMapping("rest-api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/emloyee-list")
    public List<Employee> getAllEmployeeList() {
        employeeService.getAllEmployeeList();
        return null;
    }

}
