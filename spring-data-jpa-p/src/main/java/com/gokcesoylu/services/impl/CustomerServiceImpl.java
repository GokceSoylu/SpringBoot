package com.gokcesoylu.services.impl;

import java.beans.beancontext.BeanContext;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoAddress;
import com.gokcesoylu.dto.DtoCustomer;
import com.gokcesoylu.model.Address;
import com.gokcesoylu.model.Customer;
import com.gokcesoylu.repository.CustomerRepository;
import com.gokcesoylu.services.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DtoCustomer GetCustomerById(Long id) {

        Optional<Customer> opt = customerRepository.findById(id);
        if (opt.isEmpty())
            return null;
        else {
            DtoAddress dtoAddress = new DtoAddress();
            DtoCustomer dtoCustomer = new DtoCustomer();

            Customer customer = opt.get();
            Address address = opt.get().getAddress();
            BeanUtils.copyProperties(customer, dtoCustomer);
            BeanUtils.copyProperties(address, dtoAddress);
            dtoCustomer.setDtoAddress(dtoAddress);
            return dtoCustomer;
        }
    }

}
