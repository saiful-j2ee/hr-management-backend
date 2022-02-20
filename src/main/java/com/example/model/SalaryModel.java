package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="salary_table")

public class SalaryModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	int id;
	long userid;
	String username;
	String bankname;
	long accountno;
	String makedate;
	int stdays;
	int absenceday;
	int workingdays;
	String location;
	String department;
	String designation;
	double basic;
	double houserent;
	double specialallowance;
	double bonus;
	double medicalallowance;
	double transport;
	double provident;
	double professionaltex;
	double incometex;
	int absence;
	int grossearn;
	int grossdedaction;
	int netsalary;
	public int getId() {
		return id;
	}
	public long getUserid() {
		return userid;
	}
	public String getUsername() {
		return username;
	}
	public String getBankname() {
		return bankname;
	}
	public long getAccountno() {
		return accountno;
	}
	public String getMakedate() {
		return makedate;
	}
	public int getStdays() {
		return stdays;
	}
	public int getAbsenceday() {
		return absenceday;
	}
	public int getWorkingdays() {
		return workingdays;
	}
	public String getLocation() {
		return location;
	}
	public String getDepartment() {
		return department;
	}
	public String getDesignation() {
		return designation;
	}
	public double getBasic() {
		return basic;
	}
	public double getHouserent() {
		return houserent;
	}
	public double getSpecialallowance() {
		return specialallowance;
	}
	public double getBonus() {
		return bonus;
	}
	public double getMedicalallowance() {
		return medicalallowance;
	}
	public double getTransport() {
		return transport;
	}
	public double getProvident() {
		return provident;
	}
	public double getProfessionaltex() {
		return professionaltex;
	}
	public double getIncometex() {
		return incometex;
	}
	public int getAbsence() {
		return absence;
	}
	public int getGrossearn() {
		return grossearn;
	}
	public int getGrossdedaction() {
		return grossdedaction;
	}
	public int getNetsalary() {
		return netsalary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public void setMakedate(String makedate) {
		this.makedate = makedate;
	}
	public void setStdays(int stdays) {
		this.stdays = stdays;
	}
	public void setAbsenceday(int absenceday) {
		this.absenceday = absenceday;
	}
	public void setWorkingdays(int workingdays) {
		this.workingdays = workingdays;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public void setHouserent(double houserent) {
		this.houserent = houserent;
	}
	public void setSpecialallowance(double specialallowance) {
		this.specialallowance = specialallowance;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	public void setMedicalallowance(double medicalallowance) {
		this.medicalallowance = medicalallowance;
	}
	public void setTransport(double transport) {
		this.transport = transport;
	}
	public void setProvident(double provident) {
		this.provident = provident;
	}
	public void setProfessionaltex(double professionaltex) {
		this.professionaltex = professionaltex;
	}
	public void setIncometex(double incometex) {
		this.incometex = incometex;
	}
	public void setAbsence(int absence) {
		this.absence = absence;
	}
	public void setGrossearn(int grossearn) {
		this.grossearn = grossearn;
	}
	public void setGrossdedaction(int grossdedaction) {
		this.grossdedaction = grossdedaction;
	}
	public void setNetsalary(int netsalary) {
		this.netsalary = netsalary;
	}
	
}
