package com.OnlineBanking.demo.Beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bank {
	private long bid;
	private String bname;
	private String bcity;
	private long bphone;

	public Bank() {
	}

	protected Bank(long bid, String bname, String bcity, long bphone) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.bcity = bcity;
		this.bphone = bphone;
	
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	

	public long getBid() {
		return bid;
	}

	public void setBid(long bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBcity() {
		return bcity;
	}

	public void setBcity(String bcity) {
		this.bcity = bcity;
	}

	public long getBphone() {
		return bphone;
	}

	public void setBphone(long bphone) {
		this.bphone = bphone;
	}

	
	

}
