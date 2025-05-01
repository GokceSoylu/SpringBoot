package com.gokcesoylu.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gokcesoylu.model.Employee;

@Repository
public class EmployeeRepository {

    @Autowired
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee getEmployeeById(String id) {
        Employee finEmployee = null;
        for (Employee employee : employeeList) {
            if (id.equals(employee.getId())) {
                finEmployee = employee;
                break;
            }
        }
        return finEmployee;
    }

    public String getEmployeeIdByName(String name) {
        String id = null;
        for (Employee employee : employeeList) {
            if (name.equals(employee.getFirstname())) {
                id = employee.getId();
                break;
            }
        }
        return id;
    }
}
