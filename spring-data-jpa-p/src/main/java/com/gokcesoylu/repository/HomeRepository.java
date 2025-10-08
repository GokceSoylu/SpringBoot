package com.gokcesoylu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gokcesoylu.dto.DtoHome;
import com.gokcesoylu.model.Home;

@Repository
public interface HomeRepository extends JpaRepository<Home, Long> {
    public DtoHome getHomeById(Long id);
}
