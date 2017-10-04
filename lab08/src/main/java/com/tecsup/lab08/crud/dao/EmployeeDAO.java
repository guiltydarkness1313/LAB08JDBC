package com.tecsup.lab08.crud.dao;

import java.util.ArrayList;

import com.tecsup.lab08.crud.bean.Employee;

public interface EmployeeDAO {
	
	ArrayList<Employee> findAll();
	
	Employee findById(int id);
	
	
	int create(String pFirstname, String pLastname, Double pSalary);
	
	void delete(int id);
	
	void update(int id, String pFirstname, String pLastname, Double pSalary);
}
