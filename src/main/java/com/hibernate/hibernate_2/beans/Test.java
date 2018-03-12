/**
 * 
 */
package com.hibernate.hibernate_2.beans;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * @author g002ax
 *
 */
public class Test {
	final static Logger logger = Logger.getLogger(Test.class);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Department dept = new Department();
		dept.setDeptno(1);
		dept.setDeptname("Accounts");
		
		Employee emp = new Employee(1,"Tarun","khandelwaltarun007@gmail.com",200000,dept);
		Employee emp1 = new Employee(2,"Harsh","harsh4ukhandelwal@gmail.com",500000,dept);
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(emp);
		emplist.add(emp1);
		dept.setEmployeelist(emplist);
		
		Configuration cfg = new Configuration().configure();
		Session session = cfg.buildSessionFactory().openSession();
		Transaction tx = session.beginTransaction();
		session.save(dept);
		session.save(emp);
		session.save(emp1);
		
		tx.commit();
		session.getSessionFactory().close();
		logger.info("saved.");
	}

}
