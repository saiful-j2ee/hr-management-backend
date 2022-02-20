package com.example.reprository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.SalaryModel;

@Repository
public interface SalaryRepository extends CrudRepository<SalaryModel, Integer> {
	

}
