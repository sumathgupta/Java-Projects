package com.zensar.training.bean;

import java.time.LocalDate;

public class Employee {
	private int employeeId;
	private String name;
	private LocalDate dateofJoining;
	private double basicSalary;
	private Gender gender;
	public Employee(int employeeId, String name, LocalDate dateofJoining, double basicSalary, Gender gender) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.dateofJoining = dateofJoining;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateofJoining() {
		return dateofJoining;
	}
	public void setDateofJoining(LocalDate dateofJoining) {
		this.dateofJoining = dateofJoining;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", dateofJoining=" + dateofJoining
				+ ", basicSalary=" + basicSalary + ", gender=" + gender + "]";
	}
	public Employee(String name, LocalDate dateofJoining, double basicSalary, Gender gender) {
		super();
		this.name = name;
		this.dateofJoining = dateofJoining;
		this.basicSalary = basicSalary;
		this.gender = gender;
	}

}
