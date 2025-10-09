package com.gokcesoylu.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoCourse;
import com.gokcesoylu.dto.DtoStudent;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.model.Course;
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
    public List<DtoStudent> getAllStudents() {
        List<Student> stdList = new ArrayList<>();
        List<DtoStudent> dtoStudents = new ArrayList<>();
        stdList = studentRepository.findAll();
        for (Student student : stdList) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            dtoStudents.add(dtoStudent);
        }
        return dtoStudents;
    }

    @Override
    public DtoStudent getStudentById(Integer id) {
        Optional<Student> os = studentRepository.findById(id);
        if (os.isPresent()) {
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(os.get(), dtoStudent);
            if (!dtoStudent.getCourses().isEmpty() && dtoStudent.getCourses() != null) {
                for (Course course : os.get().getCourses()) {
                    DtoCourse dtoCourse = new DtoCourse();
                    dtoCourse.setName(course.getName());
                    dtoStudent.getCourses().add(dtoCourse);
                }
            }
            return dtoStudent;
        } else
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
        Optional<Student> opt = studentRepository.findById(id);
        if (opt != null) {
            Student std = new Student();
            std = opt.get();
            std.setFirstname(dtoStudentIU.getFirstname());
            std.setLastname(dtoStudentIU.getLastname());
            std.setBirthOfDate(dtoStudentIU.getBirthOfDate());
            std = studentRepository.save(std);
            DtoStudent dtoStudent = new DtoStudent();
            BeanUtils.copyProperties(std, dtoStudent);
            return dtoStudent;
        }
        return null;
    }

}
