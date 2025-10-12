package com.gokcesoylu.controller.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.configuration.DataSource;
import com.gokcesoylu.configuration.GlobalProperties;
import com.gokcesoylu.controller.IPropertySourceController;

@RestController
@RequestMapping("/rest/api/property")
public class PropertySourceControllerImpl implements IPropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @Override
    @GetMapping("/datasource")
    public DataSource getDataSource() {
        DataSource dataSource = new DataSource();
        BeanUtils.copyProperties(globalProperties, dataSource);
        return dataSource;
    }

}
