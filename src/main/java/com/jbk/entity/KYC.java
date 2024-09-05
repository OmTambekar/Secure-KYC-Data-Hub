package com.jbk.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class KYC {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int custId;
	private String custName;
	private String custGender;
	private String custCountry;
	
	public KYC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KYC(String custName, String custGender, String custCountry) {
		super();
		this.custName = custName;
		this.custGender = custGender;
		this.custCountry = custCountry;
	}
	
	

	@Override
	public String toString() {
		return "KYC [custId=" + custId + ", custName=" + custName + ", custGender=" + custGender + ", custCountry="
				+ custCountry + "]";
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGender() {
		return custGender;
	}

	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	public String getCustCountry() {
		return custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}
	
	
	

}
