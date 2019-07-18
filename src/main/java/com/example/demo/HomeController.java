package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.employee;
import com.example.demo.service.employeeServiceInterface;

@Controller
public class HomeController {

	@Autowired
	private employeeServiceInterface service;
	
	@RequestMapping("/")
	public String GetPage(Model model)
	{
		List<employee> list=service.GetAllEmployee();
		model.addAttribute("list", list);
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String GetLoginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String GetLogout()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/create")
	public String Create(@RequestParam("ename") String ename,
			             @RequestParam("edesign") String edesign,
			             Model model
			                 ) 
	{
		employee emp=new employee();
		emp.setEname(ename);
		emp.setEdesign(edesign);
		service.saveEmployee(emp);

		List<employee> list=service.GetAllEmployee();
		model.addAttribute("list", list);
		return "home.jsp";
	}
	
	@RequestMapping("/delete")
	public String Delete(@RequestParam("eid") int eid,Model model)
	{
		service.deleteEmployee(eid);
		List<employee> list=service.GetAllEmployee();
		model.addAttribute("list", list);
		return "home.jsp";
	}
	
	@RequestMapping("/getemp")
	public String getEmp(@RequestParam("eid") int eid,Model model) 
	{
		employee emp=service.getEmployeeByID(eid);
		model.addAttribute("eid", emp.getEid());
		model.addAttribute("ename", emp.getEname());
		model.addAttribute("edesign", emp.getEdesign());
		
		List<employee> list=service.GetAllEmployee();
		model.addAttribute("list", list);
		return "home.jsp";
	}
	
	@RequestMapping("/update")
	public String Update(
			@RequestParam("eid") int eid,
			@RequestParam("ename") String ename,
            @RequestParam("edesign") String edesign,
            Model model
			            ) 
	{
		service.updateEmployee(eid, ename, edesign);
		List<employee> list=service.GetAllEmployee();
		model.addAttribute("list", list);
		return "home.jsp";
	}
}

