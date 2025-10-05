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

    @Override
    public boolean deleteStudent(Integer id) {
        if (id.equals(null))
            return false;
        else
            studentRepository.deleteById(id);
        return true;
    }

    @Override
    public boolean updateStudent(Integer id, Student updateStudent) {
        Student std_db = getStudentById(id);
        if (std_db != null) {
            std_db.setFirstname(updateStudent.getFirstname());
            std_db.setLastname(updateStudent.getLastname());
            std_db.setBirthOfDate(updateStudent.getBirthOfDate());
            saveStudent(std_db);
            return true;
        }
        return false;
    }

}
