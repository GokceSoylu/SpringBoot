package com.gokcesoylu.services;

import com.gokcesoylu.dto.DtoAddress;

public interface IAddressService {
    public DtoAddress getAddressById(Integer id);
}
