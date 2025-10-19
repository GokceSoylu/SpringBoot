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
public class DtoStudentIU {
    private String name;
    private List<DtoCourseIU> courses = new ArrayList<>();;
    private Supervizor supervizor;
}
