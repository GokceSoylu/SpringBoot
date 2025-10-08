package com.gokcesoylu.services.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoAddress;
import com.gokcesoylu.dto.DtoCustomer;
import com.gokcesoylu.model.Address;
import com.gokcesoylu.model.Customer;
import com.gokcesoylu.repository.AddressRepository;
import com.gokcesoylu.services.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public DtoAddress getAddressById(Integer id) {
        Optional<Address> opt = addressRepository.findById(id);
        if (opt.isEmpty())
            return null;
        else {
            DtoAddress dtoAddress = new DtoAddress();
            Customer customer = new Customer();
            DtoCustomer dtoCustomer = new DtoCustomer();
            Address address = new Address();
            address = opt.get();
            customer = opt.get().getCustomer();
            BeanUtils.copyProperties(address, dtoAddress);
            BeanUtils.copyProperties(dtoCustomer, customer);
            dtoAddress.setCustomer(dtoCustomer);
            return dtoAddress;
        }

    }

}
