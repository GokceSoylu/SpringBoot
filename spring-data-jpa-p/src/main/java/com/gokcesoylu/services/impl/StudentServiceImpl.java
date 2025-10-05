package com.gokcesoylu.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.model.Student;
import com.gokcesoylu.repository.StudentRepository;
import com.gokcesoylu.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {

        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Integer id) {
        Optional<Student> os = studentRepository.findById(id);
        if (os.isPresent())
            return os.get();
        else
            return null;
    }

}
