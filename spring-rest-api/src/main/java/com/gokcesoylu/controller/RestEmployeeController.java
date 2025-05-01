package com.gokcesoylu.controller;

import com.gokcesoylu.model.*;
import com.gokcesoylu.services.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(path = "/rest/api")
public class RestEmployeeController {

    private List<Employee> employeeList;

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

    @GetMapping(path = "/employee/{name}")
    public String getEmployeeIdByName(@PathVariable(name = "name", required = true) String name) {
        return employeeService.getEmployeeIdByName(name);
    }
}
