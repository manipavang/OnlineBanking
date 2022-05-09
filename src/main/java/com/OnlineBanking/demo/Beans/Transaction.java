package com.OnlineBanking.demo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	private Long tid;
	private Long acno;
	private String tname;
	private String branch;
	private Long amount;

	public Transaction() {
	}

	protected Transaction(Long tid, Long acno, String tname, String branch, Long amount) {
		super();
		this.tid = tid;
		this.acno = acno;
		this.tname = tname;
		this.branch = branch;
		this.amount = amount;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	public Long getTid() {
		return tid;
	}
	public void setTid(Long tid) {
		this.tid = tid;
	}

	public Long getAcno() {
		return acno;
	}

	public void setAcno(Long acno) {
		this.acno = acno;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Long getAmount() {
		return amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}
}
	
	
	
	
