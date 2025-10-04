package com.gokcesoylu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokcesoylu.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {// üzeinde işlem yapacağımız sınıfı ve
                                                                            // id'sinin veri tipini parametre olarak
                                                                            // veriyoruz

}
