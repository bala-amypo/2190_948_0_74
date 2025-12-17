package com.example.demo.repository;

import org.springfranework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.*;
import com.example.demo.entity.studentEntity;

public interface studentRep extends JpaRepository<studentEntity,Long>{

}