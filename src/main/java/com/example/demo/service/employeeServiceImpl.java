package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.employeeDAOInterface;
import com.example.demo.model.employee;

@Service
public class employeeServiceImpl implements employeeServiceInterface {
	
	@Autowired
	private employeeDAOInterface dao;
	
	@Transactional
	@Override
	public List<employee> GetAllEmployee() 
	{
		List<employee> list=dao.GetAllEmployee(); 
		return list;
	}

	@Transactional
	@Override
	public void saveEmployee(employee emp) 
	{
		dao.saveEmployee(emp);
	}

	@Transactional
	@Override
	public void deleteEmployee(int eid) 
	{
		dao.deleteEmployee(eid);
	}
	
	@Transactional
	@Override
	public void updateEmployee(int eid, String ename, String edesign) 
	{
		dao.updateEmployee(eid, ename, edesign);
	}

	@Transactional
	@Override
	public employee getEmployeeByID(int eid) 
	{
		employee emp=dao.getEmployeeByID(eid);
		return emp;
	}

}
