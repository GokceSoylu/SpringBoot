package com.gokcesoylu.services;

import java.util.List;

import com.gokcesoylu.model.Student;

public interface IStudentService {
    public Student saveStudent(Student student);

    public List<Student> getAllStudents();

    public Student getStudentById(Integer id);

    public boolean deleteStudent(Integer id);

    public boolean updateStudent(Integer id, Student updaStudent);

}
