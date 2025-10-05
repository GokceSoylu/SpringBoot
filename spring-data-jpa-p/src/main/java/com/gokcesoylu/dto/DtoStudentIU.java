package com.gokcesoylu.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoStudentIU {
    private String firstname;
    private String lastname;
    private Date birthOfDate;
}
