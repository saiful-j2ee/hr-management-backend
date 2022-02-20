package com.example.reprository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {

	Employee findByEmail(String email);

	
	

}
