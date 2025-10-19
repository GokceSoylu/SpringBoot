package com.gokcesoylu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokcesoylu.model.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {

}
