package com.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restful.Entity.SchoolEntity;
import com.restful.service.SchoolService;

@RestController
public class SchoolRestContollers {

	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("/schoolAdd")
	public ResponseEntity<String> createSchool(@RequestBody SchoolEntity schoolEntity){
		String status = schoolService.upsert(schoolEntity);
		return new ResponseEntity<>(status,HttpStatus.CREATED);
	}
	
	
	@GetMapping("/allschool")
	public ResponseEntity<List<SchoolEntity>> getAllSchool(){
		List<SchoolEntity> allschool = schoolService.getAllScholl();
		return new ResponseEntity<>(allschool,HttpStatus.OK);
	}
}
