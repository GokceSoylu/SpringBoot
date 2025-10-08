package com.gokcesoylu.controller;

import com.gokcesoylu.dto.DtoEmployee;

public interface IEmployeeController {
    public DtoEmployee getEpmloyeeById(Long id);
}
