package com.example.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.controller.storage.service.FileStorageService;
import com.example.model.AddEmployee;
import com.example.model.ApiResponse;
import com.example.model.Status;
import com.example.reprository.AddEmployeeRepo;

@RestController
@CrossOrigin(origins="http://localhost:4200", maxAge=3600)
public class AddEmployeeController {
	@Autowired
	private FileStorageService fileStorageService;
	
	@Autowired
	private AddEmployeeRepo addEmployeeRepo;
	
	ApiResponse res = new ApiResponse();
	
	@PostMapping("/save")
	public ApiResponse save(@RequestBody AddEmployee addEmployee) {
		res.getData().put("employee", addEmployee);
		try {
			
			addEmployeeRepo.save(addEmployee);
			res.setMsg("Signup successful !");
			res.setStatus(Status.success);
			
		} catch (Exception e) {

			res.setMsg("Sign up failed!");
			res.setStatus(Status.failed);

		}
		return res;
	}
	
	
	
	
	
	
	@PostMapping("/saveemployee_withfile")
	public ResponseEntity<Map> saveFormData(@ModelAttribute AddEmployee addEmployee,
			@RequestParam("file") MultipartFile file) {
		Map<String, Object> map = new HashMap<String, Object>();
		try {

			String fileName = fileStorageService.storeFile(file);

			String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/downloadFile/")
					.path(fileName).toUriString();
			addEmployee.setImages(fileName);
			addEmployee.setImagesUri(fileDownloadUri);

//			UserModel user = userService.findById(userId).get();
//			advertisingForm.setUser(user);

			addEmployee = addEmployeeRepo.save(addEmployee);
			map.put("status", "Success");
			map.put("data", addEmployee);
			map.put("message", "Data saved successfully");
			return ResponseEntity.ok(map);

		} catch (Exception e) {
			map.put("status", "failed");
			map.put("data", null);
			map.put("message", e.getLocalizedMessage());
			return ResponseEntity.status(500).body(map);
		}

	}

	
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getEmployee() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<AddEmployee> employeeList =(List<AddEmployee>) addEmployeeRepo.findAll();
			map.put("message", "Employee get successfully");
			map.put("Data", employeeList);
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
	
	@PostMapping("/update")
	public ResponseEntity<?> update(@RequestBody AddEmployee entity) {
		Map<String, Object> map = new HashMap<>();
		try {
			AddEmployee employee = addEmployeeRepo.save(entity);
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
	
	@GetMapping(value = "/delete/{id}")
	public ResponseEntity<?> delete(@PathVariable(value = "id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		
		try {
			AddEmployee employee = addEmployeeRepo.findById(id).get();
			addEmployeeRepo.delete(employee);
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
