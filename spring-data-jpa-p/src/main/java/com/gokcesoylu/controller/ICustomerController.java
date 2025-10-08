package com.gokcesoylu.controller;

import com.gokcesoylu.dto.DtoCustomer;

public interface ICustomerController {

    public DtoCustomer getCustomerById(Long id);
}
