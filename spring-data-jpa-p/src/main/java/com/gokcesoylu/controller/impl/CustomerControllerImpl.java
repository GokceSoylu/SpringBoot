package com.gokcesoylu.controller.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.ICustomerController;
import com.gokcesoylu.dto.DtoCustomer;
import com.gokcesoylu.services.ICustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/list/{id}")
    @Override
    public DtoCustomer getCustomerById(@PathVariable(name = "id") Long id) {
        return customerService.GetCustomerById(id);
    }
}
