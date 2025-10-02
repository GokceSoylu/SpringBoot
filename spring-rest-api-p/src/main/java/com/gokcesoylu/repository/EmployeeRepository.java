package com.gokcesoylu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gokcesoylu.model.Employee;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employees;

    public List<Employee> getAllEmployeeList() {

        return employees;
    }
}
