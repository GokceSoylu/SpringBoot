package com.gokcesoylu.repository;

import java.util.ArrayList;
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

    public Employee getEmployeeById(String id) {
        Employee findEmployee = null;
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                findEmployee = e;
                break;
            }
        }
        return findEmployee;
    }

    public List<Employee> getEmployeeWithParams(String firstname, String lastname) {
        List<Employee> emlpoyeeListParams = new ArrayList<>();
        if (firstname == null & lastname == null)
            return employees;

        if (firstname != null & lastname != null) {
            for (Employee e : employees) {
                if (firstname.equals(e.getFirstname()) & lastname.equals(e.getLastname())) {
                    emlpoyeeListParams.add(e);
                }
            }
        } else if (firstname == null) {
            for (Employee e : employees) {
                if (lastname.equals(e.getLastname())) {
                    emlpoyeeListParams.add(e);
                }
            }
        } else {
            for (Employee e : employees) {
                if (firstname.equals(e.getFirstname())) {
                    emlpoyeeListParams.add(e);
                }
            }
        }

        return emlpoyeeListParams;
    }
}
