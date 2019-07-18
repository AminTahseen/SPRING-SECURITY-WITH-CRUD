package com.example.demo.DAO;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.query.Query;
import com.example.demo.model.employee;

@Repository
public class employeeDAOImpl implements employeeDAOInterface{

	@Autowired
	private EntityManager em; 
	
	Session session;

	
	@Override
	public List<employee> GetAllEmployee() 
	{
		session=em.unwrap(Session.class);
		Query<employee> query=session.createQuery("from employee", employee.class);
		List<employee> list=query.getResultList();
		return list;
	}

	@Override
	public void saveEmployee(employee emp) 
	{
		session=em.unwrap(Session.class);
		session.save(emp);
	}

	@Override
	public void deleteEmployee(int eid) 
	{
		session=em.unwrap(Session.class);
		employee emp=session.get(employee.class, eid);
		session.delete(emp);
	}

	@Override
	public void updateEmployee(int eid, String ename, String edesign)
	{
		session=em.unwrap(Session.class);
		employee emp=session.get(employee.class,eid);
		emp.setEname(ename);
		emp.setEdesign(edesign);
		session.update(emp);
	}

	@Override
	public employee getEmployeeByID(int eid) 
	{
		session=em.unwrap(Session.class);
		employee emp=session.get(employee.class,eid);
		return emp;
	}
	
}
