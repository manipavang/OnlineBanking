package com.OnlineBanking.demo.Beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Withdrawal {
	private Long wid;
	private Long waccno;
	private String wifsccode;
	private String waccholdername;
	private Long wamount;
	
	
	public Withdrawal() {
		
	}
	
	
	public Withdrawal(Long wid, Long waccno, String wifsccode, String waccholdername, Long wamount) {
		super();
		this.wid = wid;
		this.waccno = waccno;
		this.wifsccode = wifsccode;
		this.waccholdername = waccholdername;
		this.wamount = wamount;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getWid() {
		return wid;
	}
	public void setWid(Long wid) {
		this.wid = wid;
	}
	public Long getWaccno() {
		return waccno;
	}
	public void setWaccno(Long waccno) {
		this.waccno = waccno;
	}
	public String getWifsccode() {
		return wifsccode;
	}
	public void setWifsccode(String wifsccode) {
		this.wifsccode = wifsccode;
	}
	public String getWaccholdername() {
		return waccholdername;
	}
	public void setWaccholdername(String waccholdername) {
		this.waccholdername = waccholdername;
	}
	public Long getWamount() {
		return wamount;
	}
	public void setWamount(Long wamount) {
		this.wamount = wamount;
	}
	
	
	
}