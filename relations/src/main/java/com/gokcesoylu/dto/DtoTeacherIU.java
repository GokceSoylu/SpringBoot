package com.gokcesoylu.dto;

import java.util.List;

import com.gokcesoylu.model.Course;
import com.gokcesoylu.model.Office;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoTeacherIU {
    private String name;
    private Office office;
    private List<Course> courses;
}
