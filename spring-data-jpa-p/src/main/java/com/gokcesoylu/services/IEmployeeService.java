package com.gokcesoylu.services;

import com.gokcesoylu.dto.DtoEmployee;

public interface IEmployeeService {
    public DtoEmployee getEpmloyeeById(Long id);
}
