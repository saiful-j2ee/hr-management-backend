package com.example.controller;




import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.controller.storage.service.FileStorageService;
import com.example.model.ApiResponse;
import com.example.model.Employee;
import com.example.model.Status;
import com.example.reprository.EmployeeRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
public class EmployeeController {
	@Autowired
	private EmployeeRepo employeeRepo;

	ApiResponse res = new ApiResponse();

	// get all employees
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepo.findAll();
	}

	
	@PostMapping("/signup")
	public ApiResponse saveuser(@RequestBody Employee employee,@RequestParam("file") MultipartFile file) {
		
		res.getData().put("employee", employee);
		try {
			String fileName = new String();
			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
					.path(fileName).toUriString();
			((Employee) employeeRepo).setImages(fileName);
			((Employee) employeeRepo).setImagesUri(fileDownloadUri);
			
			
			employeeRepo.save(employee);
			res.setMsg("Signup successful !");
			res.setStatus(Status.success);
			
		} catch (Exception e) {

			res.setMsg("Sign up failed!");
			res.setStatus(Status.failed);

		}

		return res;

	}
	
	
	
	
	

}
