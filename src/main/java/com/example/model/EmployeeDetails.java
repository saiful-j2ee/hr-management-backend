package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee_details")
public class EmployeeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	private String fathername;
	private String mothername;
	private String dateofbirth;
	private String placeofbirth;
	private String gender;
	private String languageknown;
	private String mothertongue;
	private String nationality;
	private String district;
	private String devision;
	private String police;
	private String vill;
	private String postoffice;
	private String qualification;
	private String instituited;
	private String pass;
	private String mark;
	private String comaddress;
	private String work;
	private String duration;
	private String enddutation;
	private String jobtype;
	private String joindate;
	private String joblocation;
	private String pcode;
	private String place;
	private String country;
	private String phone;
	private String email;
	private String nationalid;
	private String birthid;
	private String photo;
	public int getId() {
		return id;
	}
	public String getFirstname() {
		return firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public String getFathername() {
		return fathername;
	}
	public String getMothername() {
		return mothername;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public String getPlaceofbirth() {
		return placeofbirth;
	}
	public String getGender() {
		return gender;
	}
	public String getLanguageknown() {
		return languageknown;
	}
	public String getMothertongue() {
		return mothertongue;
	}
	public String getNationality() {
		return nationality;
	}
	public String getDistrict() {
		return district;
	}
	public String getDevision() {
		return devision;
	}
	public String getPolice() {
		return police;
	}
	public String getVill() {
		return vill;
	}
	public String getPostoffice() {
		return postoffice;
	}
	public String getQualification() {
		return qualification;
	}
	public String getInstituited() {
		return instituited;
	}
	public String getPass() {
		return pass;
	}
	public String getMark() {
		return mark;
	}
	public String getComaddress() {
		return comaddress;
	}
	public String getWork() {
		return work;
	}
	public String getDuration() {
		return duration;
	}
	public String getEnddutation() {
		return enddutation;
	}
	public String getJobtype() {
		return jobtype;
	}
	public String getJoindate() {
		return joindate;
	}
	public String getJoblocation() {
		return joblocation;
	}
	public String getPcode() {
		return pcode;
	}
	public String getPlace() {
		return place;
	}
	public String getCountry() {
		return country;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public String getNationalid() {
		return nationalid;
	}
	public String getBirthid() {
		return birthid;
	}
	public String getPhoto() {
		return photo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	public void setMothername(String mothername) {
		this.mothername = mothername;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public void setPlaceofbirth(String placeofbirth) {
		this.placeofbirth = placeofbirth;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setLanguageknown(String languageknown) {
		this.languageknown = languageknown;
	}
	public void setMothertongue(String mothertongue) {
		this.mothertongue = mothertongue;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public void setDevision(String devision) {
		this.devision = devision;
	}
	public void setPolice(String police) {
		this.police = police;
	}
	public void setVill(String vill) {
		this.vill = vill;
	}
	public void setPostoffice(String postoffice) {
		this.postoffice = postoffice;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public void setInstituited(String instituited) {
		this.instituited = instituited;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public void setComaddress(String comaddress) {
		this.comaddress = comaddress;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public void setEnddutation(String enddutation) {
		this.enddutation = enddutation;
	}
	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public void setJoblocation(String joblocation) {
		this.joblocation = joblocation;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNationalid(String nationalid) {
		this.nationalid = nationalid;
	}
	public void setBirthid(String birthid) {
		this.birthid = birthid;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	

}
