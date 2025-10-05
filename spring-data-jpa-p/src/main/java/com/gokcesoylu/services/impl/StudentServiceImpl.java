package com.gokcesoylu.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoStudent;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.model.Student;
import com.gokcesoylu.repository.StudentRepository;
import com.gokcesoylu.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU) {

        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);
        studentRepository.save(student);
        DtoStudent dtoStudent = new DtoStudent();
        BeanUtils.copyProperties(dtoStudentIU, dtoStudent);
        return dtoStudent;
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
    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU) {
        Student std_db = getStudentById(id);
        if (std_db != null) {
            BeanUtils.copyProperties(dtoStudentIU, std_db);
            DtoStudent dtoStudent = new DtoStudent();
            dtoStudent = saveStudent(dtoStudentIU);
            BeanUtils.copyProperties(std_db, dtoStudent);
            return dtoStudent;
        }
        return null;
    }

}
