package com.gokcesoylu.dto;

import java.util.ArrayList;
import java.util.List;

import com.gokcesoylu.model.Supervizor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudent {
    private Long id;
    private String name;
    private List<DtoCourse> courses = new ArrayList<>();
    private Supervizor supervizor;
}
