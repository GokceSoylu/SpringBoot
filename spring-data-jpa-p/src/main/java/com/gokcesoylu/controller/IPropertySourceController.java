package com.gokcesoylu.controller;

import java.util.List;

import com.gokcesoylu.configuration.DataSource;
import com.gokcesoylu.configuration.Server;

public interface IPropertySourceController {

    public DataSource getDataSource();

    public List<Server> getServers();
}
