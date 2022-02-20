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
import org.springframework.web.servlet.ModelAndView;

import com.example.model.AddEmployee;
import com.example.model.ApiResponse;
import com.example.model.Attendance;
import com.example.model.Status;
import com.example.reprository.AttendanceRepository;

@RestController
@CrossOrigin(origins = "*")
public class AttendanceController {
	@Autowired
	public AttendanceRepository attendanceRepository;
	
	ApiResponse res = new ApiResponse();
	
	@PostMapping("/saveAttendance")
	public ApiResponse save(@RequestBody Attendance attendance) {
		System.out.println(attendance.toString());
		
		res.getData().put("employee", attendance);
		try {
			
			attendanceRepository.save(attendance);
			res.setMsg("Signup successful !");
			res.setStatus(Status.success);
			
		} catch (Exception e) {

			res.setMsg("Sign up failed!");
			res.setStatus(Status.failed);

		}
		return res;
	}
	
	@GetMapping("/attendancerecords")
	public ResponseEntity<?> getEmployee() {
		Map<String, Object> map = new HashMap<>();
		try {
			List<Attendance> records=(List<Attendance>) attendanceRepository.findAll();
			map.put("message", "Records get successfully");
			map.put("Data", records);
			map.put("Status code", 200);
			return ResponseEntity.ok(map);
		} catch (Exception e) {
			e.printStackTrace();
			map.put("message", "records fetch failed");
			map.put("Data", null);
			map.put("Status code", 400);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(map);
		}
	}
	
	

}
