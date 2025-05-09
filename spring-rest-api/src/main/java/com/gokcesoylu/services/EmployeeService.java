package com.gokcesoylu.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.model.Employee;
import com.gokcesoylu.model.UpdateEmployeeRequest;
import com.gokcesoylu.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployeeList() {

        return employeeRepository.getEmployeeList();
    }

    public Employee getEmployeeById(String id) {
        return employeeRepository.getEmployeeById(id);
    }

    public String getEmployeeIdByName(String name) {
        return employeeRepository.getEmployeeIdByName(name);
    }

    public List<Employee> getEmployeeWithParams(String firstname, String lastname) {
        return employeeRepository.getEmployeeWithParams(firstname, lastname);
    }

    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.saveEmployee(newEmployee);
    }

    public Boolean deleteEmployee(String id) {
        return employeeRepository.deleteEmployee(id);
    }

    public Employee updateEmploye(String id, UpdateEmployeeRequest request) {
        return employeeRepository.updateEmployee(id, request);
    }
}
