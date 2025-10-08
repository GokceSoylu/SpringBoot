package com.gokcesoylu.services;

import com.gokcesoylu.dto.DtoCustomer;

public interface ICustomerService {
    public DtoCustomer GetCustomerById(Long id);

}
