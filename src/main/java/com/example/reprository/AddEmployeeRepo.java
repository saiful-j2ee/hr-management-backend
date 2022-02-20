package com.example.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.AddEmployee;

import antlr.collections.List;

@Repository
public interface AddEmployeeRepo extends JpaRepository<AddEmployee, Integer> {
	
	AddEmployee findByPassword(long password);
	
	AddEmployee findById(int id);


}
