package com.example.reprository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Attendance;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {
	

}
