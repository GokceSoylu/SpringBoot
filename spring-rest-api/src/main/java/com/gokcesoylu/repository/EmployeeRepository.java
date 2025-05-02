package com.gokcesoylu.repository;

import java.util.ArrayList;
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

    public List<Employee> getEmployeeWithParams(String firstname, String lastname) {
        List<Employee> employeesWithParams = new ArrayList<>();
        if (firstname == null && lastname == null) {
            return employeeList;
        }
        for (Employee employee : employeeList) {
            if (firstname != null && lastname != null) {
                if (employee.getFirstname().equalsIgnoreCase(firstname)
                        && employee.getLastname().equalsIgnoreCase(lastname)) {
                    employeesWithParams.add(employee);
                }
            } else if (firstname != null) {
                if (employee.getFirstname().equalsIgnoreCase(firstname))
                    employeesWithParams.add(employee);
            } else if (lastname != null)
                if (employee.getLastname().equalsIgnoreCase(lastname))
                    employeesWithParams.add(employee);
        }
        return employeesWithParams;
    }
}
