package com.gokcesoylu.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IHomeController;
import com.gokcesoylu.dto.DtoHome;
import com.gokcesoylu.services.IHomeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequestMapping("/rest/api/home")
@RestController
public class HomeControllerImpl implements IHomeController {
    @Autowired
    IHomeService homeService;

    @GetMapping("/list/{id}")
    @Override
    public DtoHome getHomeById(@PathVariable(name = "id") long id) {
        return homeService.getHomeById(id);
    }
}
