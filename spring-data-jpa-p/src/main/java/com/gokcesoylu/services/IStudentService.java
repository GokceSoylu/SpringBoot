package com.gokcesoylu.services;

import java.util.List;

import com.gokcesoylu.model.Student;

public interface IStudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();
}
