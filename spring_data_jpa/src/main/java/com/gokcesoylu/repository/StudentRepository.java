package com.gokcesoylu.repository;

import com.gokcesoylu.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
