package com.restful.service;

import java.util.List;

import com.restful.Entity.SchoolEntity;

public interface SchoolService {
	
	public String upsert(SchoolEntity schoolEntity);
	public 	SchoolEntity getById(Integer schoolId);
	public List<SchoolEntity> getAllScholl();
	public String deleteById(Integer schoolId);

}
