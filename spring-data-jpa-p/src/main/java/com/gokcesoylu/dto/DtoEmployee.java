package com.gokcesoylu.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DtoEmployee {
    private String name;
    private DtoDepartment dtoDepartment;
}
