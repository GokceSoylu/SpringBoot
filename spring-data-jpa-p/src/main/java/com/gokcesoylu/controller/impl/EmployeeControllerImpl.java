package com.gokcesoylu.controller.impl;

import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IEmployeeController;
import com.gokcesoylu.dto.DtoEmployee;
import com.gokcesoylu.services.IEmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/rest/api/employee")
@RestController
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoEmployee getEpmloyeeById(@PathVariable(name = "id") Long id) {
        return employeeService.getEpmloyeeById(id);
    }

}
