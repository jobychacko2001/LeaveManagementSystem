package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
@Table(name = "emp_data")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@Column(unique=true)
	private String email;
	private String contact;
	private String dob;
	private String gender;
	private String designation;
	private String doj;
	private String location;
	private String address;
	private String password;
	private String status;
	
	private String role;
	
	private String reportingmanager;
	private int sickleave;
	private int casualleave;
	private int personalleave;
	private int maternityleave;
	private int paternityleave;
	private int marriageleave;
	private int adoptionleave;
	
	
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(String reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public int getSickleave() {
		return sickleave;
	}
	public void setSickleave(int sickleave) {
		this.sickleave = sickleave;
	}
	
	public int getPersonalleave() {
		return personalleave;
	}
	public void setPersonalleave(int personalleave) {
		this.personalleave = personalleave;
	}
	public int getMaternityleave() {
		return maternityleave;
	}
	public void setMaternityleave(int maternityleave) {
		this.maternityleave = maternityleave;
	}
	public int getPaternityleave() {
		return paternityleave;
	}
	public void setPaternityleave(int paternityleave) {
		this.paternityleave = paternityleave;
	}
	public int getMarriageleave() {
		return marriageleave;
	}
	public void setMarriageleave(int marriageleave) {
		this.marriageleave = marriageleave;
	}
	public int getAdoptionleave() {
		return adoptionleave;
	}
	public void setAdoptionleave(int adoptionleave) {
		this.adoptionleave = adoptionleave;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getCasualleave() {
		return casualleave;
	}
	public void setCasualleave(int casualleave) {
		this.casualleave = casualleave;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + ", dob=" + dob
				+ ", gender=" + gender + ", designation=" + designation + ", doj=" + doj + ", location=" + location
				+ ", address=" + address + ", password=" + password + ", status=" + status + ", role=" + role
				+ ", reportingmanager=" + reportingmanager + ", sickleave=" + sickleave + ", casualleave=" + casualleave
				+ ", personalleave=" + personalleave + ", maternityleave=" + maternityleave + ", paternityleave="
				+ paternityleave + ", marriageleave=" + marriageleave + ", adoptionleave=" + adoptionleave + "]";
	}
	

	
	
}
