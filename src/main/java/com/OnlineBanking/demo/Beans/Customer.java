package com.OnlineBanking.demo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	private Long cid;
	private String cname;
	private String clocation;
	private String coccupation;
	private Long cphno;

	public Customer() {
	}

	protected Customer( String cname, String clocation, String coccupation, Long cphno) {
		super();
		//this.cid = cid;
		this.cname = cname;
		this.clocation = clocation;
		this.coccupation = coccupation;
		this.cphno = cphno;
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getClocation() {
		return clocation;
	}

	public void setClocation(String clocation) {
		this.clocation = clocation;
	}

	public String getCoccupation() {
		return coccupation;
	}

	public void setCoccupation(String coccupation) {
		this.coccupation = coccupation;
	}

	public Long getCphno() {
		return cphno;
	}

	public void setCphno(Long cphno) {
		this.cphno = cphno;
	}


	
}
