package com.gokcesoylu.controller;

import com.gokcesoylu.model.*;
import com.gokcesoylu.services.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "/rest/api/employee")
public class RestEmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path = "/list")
    public List<Employee> getAllEmployeeList() {
        return employeeService.getAllEmployeeList();

    }

    @GetMapping(path = "/list/{id}")
    public Employee getEmployeeById(@PathVariable(name = "id", required = true) String id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping(path = "/{name}")
    public String getEmployeeIdByName(@PathVariable(name = "name", required = true) String name) {
        return employeeService.getEmployeeIdByName(name);
    }

    @GetMapping(path = "/list-with-params")
    public List<Employee> getEmployeeWithParams(@RequestParam(name = "firstname", required = false) String firstname,
            @RequestParam(name = "lastname", required = false) String lastname) {
        System.out.println("COLSOLEG  =  " + firstname + " " + lastname);
        return employeeService.getEmployeeWithParams(firstname, lastname);

    }

    @PostMapping(path = "/save-employee")
    public Employee saveEmployee(@RequestBody Employee newEmployee) {
        return employeeService.saveEmployee(newEmployee);
    }

    @DeleteMapping(path = "/delete-employee/{id}")
    public Boolean deleteEmployee(@PathVariable("id") String id) {
        return employeeService.deleteEmployee(id);
    }

    @PutMapping(path = "/update-employee/{id}") // dikkat dostum path varaible için url'de belirtiyoruz ancak, request
                                                // body için url de birşey belirtmemize gerek yok. zeten path varaible
                                                // ile gelen url için gelirken requestbody ile hgeln isteğin body
                                                // kısmında json oalrak gelir :))
    public Employee updarEmployee(@RequestBody UpdateEmployeeRequest request, @PathVariable("id") String id) {
        return employeeService.updateEmploye(id, request);
    }
}
