package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="tbl_employee")
public class employee {
	
	@javax.persistence.Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	@Column
	private int eid;
	
	@Column
	private String ename;
	
	@Column
	private String edesign;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEdesign() {
		return edesign;
	}

	public void setEdesign(String edesign) {
		this.edesign = edesign;
	}
	
	
}
