package com.gokcesoylu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IstudentController;
import com.gokcesoylu.model.Student;
import com.gokcesoylu.services.IStudentService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IstudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public Student saveStudent(@RequestBody Student student) {

        return studentService.saveStudent(student);
    }

    @GetMapping("/list")
    @Override
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
