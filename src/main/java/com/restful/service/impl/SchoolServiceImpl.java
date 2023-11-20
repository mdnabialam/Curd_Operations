package com.restful.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restful.Entity.SchoolEntity;
import com.restful.repository.SchoolRepo;
import com.restful.service.SchoolService;
@Service
public class SchoolServiceImpl implements SchoolService {
	
	@Autowired
	private SchoolRepo schoolRepo;
	
	@Override
	public String upsert(SchoolEntity schoolEntity) {
		schoolRepo.save(schoolEntity);
		return "success";
	}

	@Override
	public SchoolEntity getById(Integer schoolId) {
		Optional<SchoolEntity> findById=schoolRepo.findById(schoolId);
		if (findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

	@Override
	public List<SchoolEntity> getAllScholl() {
		
		return schoolRepo.findAll();
	}

	@Override
	public String deleteById(Integer schoolId) {
		if (schoolRepo.existsById(schoolId)) {
			schoolRepo.deleteById(schoolId);
			return "Delete Success";
		}
		return "Not Avl School";
	}

}
