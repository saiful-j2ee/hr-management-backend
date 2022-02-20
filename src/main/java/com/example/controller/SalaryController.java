package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AddEmployee;
import com.example.model.ApiResponse;
import com.example.model.Employee;
import com.example.model.SalaryModel;
import com.example.model.Status;
import com.example.reprository.AddEmployeeRepo;
import com.example.reprository.SalaryRepository;

@RestController

public class SalaryController {

	@Autowired
	private SalaryRepository salaryRepository;
	
	@Autowired
	private AddEmployeeRepo addEmployeeRepo;
	
	
	ApiResponse res = new ApiResponse();

	
	@PostMapping("/salarysave")
	@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
	public ApiResponse save(@RequestBody SalaryModel salaryModel) {
		res.getData().put("employee", salaryModel);
		try {
			
			salaryRepository.save(salaryModel);
			res.setMsg("Signup successful !");
			res.setStatus(Status.success);
			
		} catch (Exception e) {

			res.setMsg("Sign up failed!");
			res.setStatus(Status.failed);

		}
		return res;
	}
	
	
	@GetMapping("/getAllSalary")
	public ResponseEntity<?> getSalary() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<SalaryModel> salaryList =(List<SalaryModel>) salaryRepository.findAll();
			map.put("message", "salary get successfully");
			map.put("Data", salaryList);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "salary fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
	
}
