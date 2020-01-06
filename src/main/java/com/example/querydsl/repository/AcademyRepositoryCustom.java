package com.example.querydsl.repository;

import com.example.querydsl.entity.Academy;

import java.util.List;

public interface AcademyRepositoryCustom {

    List<Academy> findByName (String name);

}
