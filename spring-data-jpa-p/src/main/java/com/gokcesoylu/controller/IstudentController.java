package com.gokcesoylu.controller;

import java.util.List;

import com.gokcesoylu.dto.DtoStudent;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.model.Student;

public interface IstudentController {

    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public boolean deleteStudent(Integer id);

    public DtoStudent updaStudent(Integer id, DtoStudentIU dtoStudentIU);
}
