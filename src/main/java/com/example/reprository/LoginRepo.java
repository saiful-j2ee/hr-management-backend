package com.example.reprository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.LoginModel;

@Repository
public interface LoginRepo extends CrudRepository<LoginModel, Integer> {
	public LoginModel findByEmail(String email);
	

}
