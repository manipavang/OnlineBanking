package com.OnlineBanking.demo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AccountDetail {
	private Long id;
	private String cname;
	private Long accountno;
	private String accounttype;
	private String ifsccode;
	

	public AccountDetail() {
	}

	protected AccountDetail( String cname, Long accountno, String accounttype, String ifsccode) {
		super();
		//this.id = cid;
		this.cname = cname;
		this.accountno = accountno;
		this.accounttype = accounttype;
		this.ifsccode = ifsccode;

	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public String getCname() {
		return cname;
	}

	
	

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Long getAccountno() {
		return accountno;
	}

	public void setAccountno(Long accountno) {
		this.accountno = accountno;
	}

	public String getAccounttype() {
		return accounttype;
	}

	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}

	public String getIfsccode() {
		return ifsccode;
	}

	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}

	
}
