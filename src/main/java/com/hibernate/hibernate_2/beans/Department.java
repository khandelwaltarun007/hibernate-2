/**
 * 
 */
package com.hibernate.hibernate_2.beans;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author g002ax
 *
 */
@Entity
@Table
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dept_no")
	private int deptno;
	
	@Column(name = "dept_name")
	private String deptname;
	
	@OneToMany(mappedBy = "dept")
	private List<Employee> employeelist;

	public Department() {
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmployeelist() {
		return employeelist;
	}

	public void setEmployeelist(List<Employee> employeelist) {
		this.employeelist = employeelist;
	}
	
}
