package com.gokcesoylu.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gokcesoylu.controller.IstudentController;
import com.gokcesoylu.dto.DtoStudent;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.services.IStudentService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/rest/api/student")
public class StudentControllerImpl implements IstudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {

        return studentService.saveStudent(dtoStudentIU);
    }

    @GetMapping("/list")
    @Override
    public List<DtoStudent> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("list/{id}")
    @Override
    public DtoStudent getStudentById(@PathVariable(name = "id", required = true) Integer id) {
        return studentService.getStudentById(id);
    }

    @DeleteMapping(path = "/delete/{id}")
    @Override
    public boolean deleteStudent(@PathVariable(name = "id", required = true) Integer id) {

        return studentService.deleteStudent(id);
    }

    @PostMapping("update/{id}")
    @Override
    public DtoStudent updaStudent(@PathVariable(name = "id", required = true) Integer id,
            @RequestBody DtoStudentIU dtoStudentIU) {
        return studentService.updateStudent(id, dtoStudentIU);
    }
}
