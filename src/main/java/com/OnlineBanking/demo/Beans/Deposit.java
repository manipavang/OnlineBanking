package com.OnlineBanking.demo.Beans;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Deposit {
	private Long did;
	private Long daccno;
	private String difsccode;
	private String daccholdername;
	private Long damount;
	
	public Deposit() {
		
	}

	protected Deposit(Long did,Long daccno, String difsccode, String daccholdername, Long damount) {
		super();
		this.did = did;
		this.daccno = daccno;
		this.difsccode = difsccode;
		this.daccholdername = daccholdername;
		this.damount = damount;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getDid() {
		return did;
	}

	public void setDid(Long did) {
		this.did = did;
	}

	public Long getDaccno() {
		return daccno;
	}

	public void setDaccno(Long daccno) {
		this.daccno = daccno;
	}

	public String getDifsccode() {
		return difsccode;
	}

	public void setDifsccode(String difsccode) {
		this.difsccode = difsccode;
	}

	public String getDaccholdername() {
		return daccholdername;
	}

	public void setDaccholdername(String daccholdername) {
		this.daccholdername = daccholdername;
	}

	public Long getDamount() {
		return damount;
	}

	public void setDamount(Long damount) {
		this.damount = damount;
	}
	
	
}