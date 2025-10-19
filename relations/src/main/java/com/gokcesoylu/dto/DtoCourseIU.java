package com.gokcesoylu.dto;

import com.gokcesoylu.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCourseIU {
    private String name;
    private Teacher teacher;
}
