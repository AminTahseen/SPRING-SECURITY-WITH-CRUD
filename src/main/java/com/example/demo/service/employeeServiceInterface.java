package com.example.demo.service;

import java.util.List;

import com.example.demo.model.employee;

public interface employeeServiceInterface {
	
	List<employee> GetAllEmployee();
	
	void saveEmployee(employee emp);
	
	void deleteEmployee(int eid);
	
	void updateEmployee(int eid,String ename,String edesign);
	
	employee getEmployeeByID(int eid);
	
}
