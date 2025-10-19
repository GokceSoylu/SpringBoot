package com.gokcesoylu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IStudentController;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.sevice.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/rest/api/student")
public class StudentController implements IStudentController {

    @Autowired
    IStudentService studentService;

    @GetMapping("/list")
    @Override
    public List<DtoStudentIU> getStudent() {
        return studentService.getStudent();
    }

}
