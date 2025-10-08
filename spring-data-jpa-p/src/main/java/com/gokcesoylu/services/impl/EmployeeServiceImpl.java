package com.gokcesoylu.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoDepartment;
import com.gokcesoylu.dto.DtoEmployee;
import com.gokcesoylu.model.Department;
import com.gokcesoylu.model.Employee;
import com.gokcesoylu.repository.EmployeeRepository;
import com.gokcesoylu.services.IEmployeeService;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public DtoEmployee getEpmloyeeById(Long id) {
        Optional<Employee> opt = employeeRepository.findById(id);
        if (opt.isEmpty())
            return null;
        DtoEmployee dtoEmployee = new DtoEmployee();
        Employee employee = opt.get();
        BeanUtils.copyProperties(employee, dtoEmployee);
        DtoDepartment dtoDepartment = new DtoDepartment();
        Department department = employee.getDepartmen();
        dtoDepartment.setDepartmentName(department.getDepartmentName());
        dtoEmployee.setDtoDepartment(dtoDepartment);
        return dtoEmployee;
    }
}
