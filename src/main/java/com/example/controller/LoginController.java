package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Request.PayLoad;
import com.example.model.Employee;
import com.example.reprository.EmployeeRepo;





@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)

public class LoginController {
	
	@Autowired
	public EmployeeRepo employeeRepo;
	
	@GetMapping("/")
	public String index() {
		return "Hello World";
	}
	
	
	
	@PostMapping("/login")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody Employee user) {
        List<Employee> users = (List<Employee>) employeeRepo.findAll();
        Map<String, Object> map = new HashMap<String, Object>();
        for (Employee other : users) {
            if (other.getEmail().equals(user.getEmail()) &&  other.getPassword().equals(user.getPassword())) {
            	map.put("message", "Login Successful");
            	  map.put("status", "Success");
            	  map.put("data", other);
            	  return ResponseEntity.ok(map);
            	
            }
        }
        map.put("message", "Login fail!");
        map.put("status", "Failed");
        map.put("data", null);
        return ResponseEntity.status(412).body(map);
    }


	

}
