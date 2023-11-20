package com.restful.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restful.Entity.SchoolEntity;

public interface SchoolRepo extends JpaRepository<SchoolEntity, Serializable> {

}
