package com.gokcesoylu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.model.Employee;
import com.gokcesoylu.services.EmployeeService;

@RestController
@RequestMapping("/rest/api")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/employee-list")
    public List<Employee> getAllEmployeeList() {

        return employeeService.getAllEmployeeList();
    }

    @GetMapping(path = "/employee-list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

}
