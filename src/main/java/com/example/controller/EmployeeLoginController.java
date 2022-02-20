package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.AddEmployee;
import com.example.model.ApiResponse;
import com.example.model.EmployLoginModel;
import com.example.model.Employee;
import com.example.model.Status;
import com.example.reprository.AddEmployeeRepo;


@RestController

@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
public class EmployeeLoginController {
	
	@Autowired
	private AddEmployeeRepo addEmployeeRepo;
	
	
	
	ApiResponse res = new ApiResponse();
	@PostMapping("/employeelogin")
    public ResponseEntity<Map<String, Object>> loginUser(@RequestBody EmployLoginModel employLoginModel) {
       System.out.println(employLoginModel.getPassword());
		
		AddEmployee emp =  addEmployeeRepo.findByPassword(employLoginModel.getPassword());
        Map<String, Object> map = new HashMap<String, Object>();
     
            if (emp.getPassword() == employLoginModel.getPassword()) {
            	map.put("message", "Login Successful");
            	  map.put("status", "Success");
            	  map.put("data", emp);
            	  return ResponseEntity.ok(map);


        }
        map.put("message", "Login fail!");
        map.put("status", "Failed");
        map.put("data", null);
        return ResponseEntity.status(412).body(map);
    }

	
	

}
