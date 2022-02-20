package com.example.reprository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.EmployeeDetails;

@Repository
public interface EmployeeDetailRepo extends CrudRepository<EmployeeDetails, Integer>{

}
