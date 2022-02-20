package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AddEmployee;
import com.example.model.ApiResponse;
import com.example.model.EmployeeDetails;
import com.example.model.Status;
import com.example.reprository.EmployeeDetailRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
public class EmployeeDetailController {

	@Autowired
	private EmployeeDetailRepo employeeDetailRepo;
	
	ApiResponse res = new ApiResponse();
	
	@PostMapping("/saveEmployee")
	public ApiResponse save(@RequestBody EmployeeDetails employeeDetails) {
		
		res.getData().put("employee", employeeDetails);
		try {
			
			employeeDetailRepo.save(employeeDetails);
			res.setMsg("Signup successful !");
			res.setStatus(Status.success);
			
		} catch (Exception e) {

			res.setMsg("save failed!");
			res.setStatus(Status.failed);

		}
		return res;
	}
	
	
	@GetMapping("/getDetails")
	public ResponseEntity<?> getDetails() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<EmployeeDetails> empl =(List<EmployeeDetails>) employeeDetailRepo.findAll();
			map.put("message", "Employee get successfully");
			map.put("Data", empl);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	@PostMapping("/update_detail")
	public ResponseEntity<?> update(@RequestBody EmployeeDetails entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			EmployeeDetails employee = employeeDetailRepo.save(entity);
			map.put("message", "Employee updated successfully");
			map.put("Data", employee);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee updated failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	@GetMapping(value = "/delete_detail/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		
		try {
			EmployeeDetails employee = employeeDetailRepo.findById(id).get();
			employeeDetailRepo.delete(employee);
			map.put("message", "Employee deleted successfully");
			map.put("Data", employee);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "Employee deletation failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	
}
