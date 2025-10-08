package com.gokcesoylu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IAddressController;
import com.gokcesoylu.dto.DtoAddress;
import com.gokcesoylu.services.IAddressService;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    private IAddressService addressService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DtoAddress getAddressById(@PathVariable(name = "id") Integer id) {
        return addressService.getAddressById(id);
    }

}
