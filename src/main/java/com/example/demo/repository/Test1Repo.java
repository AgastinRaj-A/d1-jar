package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Test1Model;


@Repository
public interface Test1Repo extends JpaRepository<Test1Model, Integer>{

}
