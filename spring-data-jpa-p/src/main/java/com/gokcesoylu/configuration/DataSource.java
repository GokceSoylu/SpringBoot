package com.gokcesoylu.configuration;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSource {

    private String key;
    private List<Server> servers;
}
