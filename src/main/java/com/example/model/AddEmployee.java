package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="add_employee")
public class AddEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	
	
	
	@Transient
	@JsonIgnore
	MultipartFile file;
	
	String images;
	String imagesUri;
	
	String designation;
	String fname;
	String lname;
	String department;
	String gender;
	String intime;
	String outtime;
	String dob;
	String paddress;
	String praddress;
	String phone;
	String email;
	@Column(unique = true,nullable = false)
	long password;
	double basicsalary;
	double houserent;
	double medical ;
	double transport;
	double overtime;
	double salary;
	
	
	
	public int getId() {
		return id;
	}
	public MultipartFile getFile() {
		return file;
	}
	public String getImages() {
		return images;
	}
	public String getImagesUri() {
		return imagesUri;
	}
	public String getDesignation() {
		return designation;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getDepartment() {
		return department;
	}
	public String getGender() {
		return gender;
	}
	public String getDob() {
		return dob;
	}
	public String getPaddress() {
		return paddress;
	}
	public String getPraddress() {
		return praddress;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public long getPassword() {
		return password;
	}
	public double getBasicsalary() {
		return basicsalary;
	}
	public double getHouserent() {
		return houserent;
	}
	public double getMedical() {
		return medical;
	}
	public double getTransport() {
		return transport;
	}
	public double getOvertime() {
		return overtime;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public void setImagesUri(String imagesUri) {
		this.imagesUri = imagesUri;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}
	public void setPraddress(String peaddress) {
		this.praddress = peaddress;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public void setBasicsalary(double basicsalary) {
		this.basicsalary = basicsalary;
	}
	public void setHouserent(double houserent) {
		this.houserent = houserent;
	}
	public void setMedical(double medical) {
		this.medical = medical;
	}
	public void setTransport(double transport) {
		this.transport = transport;
	}
	public void setOvertime(double overtime) {
		this.overtime = overtime;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
}
