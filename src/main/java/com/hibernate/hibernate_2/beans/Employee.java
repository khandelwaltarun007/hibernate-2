/**
 * 
 */
package com.hibernate.hibernate_2.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author g002ax
 *
 */
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_no")
	private int empno;
	
	@Column(name="Emp_name")
	private String empname;
	
	@Column(name = "Email")
	private String email;
	
	@Column(name = "Salary")
	private double salary;
	
	@ManyToOne
	@JoinColumn(name = "emplist",nullable = false)
	private Department dept;
	
	public Employee() {
	
	}

	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public Employee(int empno, String empname, String email, double salary, Department dept) {
		super();
		this.empno = empno;
		this.empname = empname;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}
	
	
}
