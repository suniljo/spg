package com.spg.hibernate.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer employeeId;
	
	@Column(name = "ename")
	private String employeeName;
	
	@Column(name = "esal")
	private Float employeeSal;
	
	//@OneToOne(cascade = CascadeType.PERSIST)
	//@OneToOne(cascade = CascadeType.REMOVE)
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addrId")
	private Address employeeAddr;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer employeeId, String employeeName, Float employeeSal) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSal = employeeSal;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Float getEmployeeSal() {
		return employeeSal;
	}

	public void setEmployeeSal(Float employeeSal) {
		this.employeeSal = employeeSal;
	}

	public Address getEmployeeAddr() {
		return employeeAddr;
	}

	public void setEmployeeAddr(Address employeeAddr) {
		this.employeeAddr = employeeAddr;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSal=" + employeeSal
				+ ", employeeAddr=" + employeeAddr + "]";
	}

}
