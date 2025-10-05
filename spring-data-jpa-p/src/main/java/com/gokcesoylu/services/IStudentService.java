package com.gokcesoylu.services;

import java.util.List;

import com.gokcesoylu.dto.DtoStudent;
import com.gokcesoylu.dto.DtoStudentIU;

public interface IStudentService {
    public DtoStudent saveStudent(DtoStudentIU dtoStudentIU);

    public List<DtoStudent> getAllStudents();

    public DtoStudent getStudentById(Integer id);

    public boolean deleteStudent(Integer id);

    public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);

}
