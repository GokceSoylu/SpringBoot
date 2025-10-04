package com.gokcesoylu.controller;

import java.util.List;

import com.gokcesoylu.model.Student;

public interface IstudentController {

    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
