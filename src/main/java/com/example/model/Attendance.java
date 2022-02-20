package com.example.model;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attendance")

public class Attendance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long userid;
	private String wdate;
	private long password;
	private String fname;
	private String lname;
	private String phone;
	private String intime;
	private String outtime;
	private boolean atlate;
	private boolean atleave;
	private boolean atabsence;
	private String totalhour;
	
	
	public Attendance() {
		super();
	}
	public Attendance(long userid, String wdate, long password, String fname, String lname, String phone, String intime,
			String outtime, boolean atlate, boolean atleave, boolean atabsence, String totalhour) {
		super();
		this.userid = userid;
		this.wdate = wdate;
		this.password = password;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;
		this.intime = intime;
		this.outtime = outtime;
		this.atlate = atlate;
		this.atleave = atleave;
		this.atabsence = atabsence;
		this.totalhour = totalhour;
	}
	public long getUserid() {
		return userid;
	}
	public String getWdate() {
		return wdate;
	}
	public long getPassword() {
		return password;
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	public String getPhone() {
		return phone;
	}
	public String getIntime() {
		return intime;
	}
	public String getOuttime() {
		return outtime;
	}
	public boolean isAtlate() {
		return atlate;
	}
	public boolean isAtleave() {
		return atleave;
	}
	public boolean isAtabsence() {
		return atabsence;
	}
	public String getTotalhour() {
		return totalhour;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public void setPassword(long password) {
		this.password = password;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public void setOuttime(String outtime) {
		this.outtime = outtime;
	}
	public void setAtlate(boolean atlate) {
		this.atlate = atlate;
	}
	public void setAtleave(boolean atleave) {
		this.atleave = atleave;
	}
	public void setAtabsence(boolean atabsence) {
		this.atabsence = atabsence;
	}
	public void setTotalhour(String totalhour) {
		this.totalhour = totalhour;
	}
	@Override
	public String toString() {
		return "Attendance [userid=" + userid + ", wdate=" + wdate + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", phone=" + phone + ", intime=" + intime + ", outtime=" + outtime + ", atlate="
				+ atlate + ", atleave=" + atleave + ", atabsence=" + atabsence + ", totalhour=" + totalhour + "]";
	}
	
	
	
}