package com.gokcesoylu.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
    private String firstname;
    private String lastname;
    private List<DtoCourse> courses = new ArrayList<>();
}
