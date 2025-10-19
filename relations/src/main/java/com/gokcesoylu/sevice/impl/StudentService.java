package com.gokcesoylu.sevice.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gokcesoylu.dto.DtoCourseIU;
import com.gokcesoylu.dto.DtoStudentIU;
import com.gokcesoylu.model.Course;
import com.gokcesoylu.model.Student;
import com.gokcesoylu.repository.IStudentRepository;
import com.gokcesoylu.sevice.IStudentService;

@Service
public class StudentService implements IStudentService {

    @Autowired
    IStudentRepository studentRepository;

    @Override
    public List<DtoStudentIU> getStudent() {
        List<Student> students = studentRepository.findAll();
        List<DtoStudentIU> dtoStudentIUs = new ArrayList<>();
        for (Student std : students) {
            DtoStudentIU dtoStudentIU = new DtoStudentIU();
            BeanUtils.copyProperties(std, dtoStudentIU);
            List<DtoCourseIU> dtoCourseUIs = new ArrayList<>();
            for (Course course : std.getCourses()) {
                DtoCourseIU dtoCourseIU = new DtoCourseIU();
                BeanUtils.copyProperties(course, dtoCourseIU);
                dtoCourseUIs.add(dtoCourseIU);
            }
            dtoStudentIU.setCourses(dtoCourseUIs);
        }
        return dtoStudentIUs;
    }
}