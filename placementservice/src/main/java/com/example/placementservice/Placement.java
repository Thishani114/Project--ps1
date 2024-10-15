package com.example.placementservice;


import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Placement {

   
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String companyName;
    private String jobTitle;
    private String placementDate;
    private String salaryPackage;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getPlacementDate() {
		return placementDate;
	}
	public void setPlacementDate(String placementDate) {
		this.placementDate = placementDate;
	}
	public String  getSalaryPackage() {
		return salaryPackage;
	}
	public void setSalaryPackage(String salaryPackage) {
		this.salaryPackage = salaryPackage;
	}
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Placement(Long id, String studentName, String companyName, String jobTitle, String placementDate,
			String salaryPackage) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.companyName = companyName;
		this.jobTitle = jobTitle;
		this.placementDate = placementDate;
		this.salaryPackage = salaryPackage;
	}
    
	

    
    // Getters and Setters
}
