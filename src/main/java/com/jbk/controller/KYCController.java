package com.jbk.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.KYC;
import com.jbk.service.KYCServices;

@RestController
public class KYCController {
	
	@Autowired
	KYCServices kycServices;

	@GetMapping("getkycdetails/{custId}")
	
	public KYC fetchKycDetails(@PathVariable ("custId") int custId) {
		System.err.println(custId);
		KYC kyc = kycServices.fetchKycDetails(custId);
		return kyc;
		
	}
	
	@GetMapping("getkycdetails/{custName}")
	
	public KYC fetchKycDetails(@PathVariable ("custName") String custName) {
		System.err.println(custName);
		KYC kyc = kycServices.fetchKycDetailsBasedOnCustomerName(custName);
		return kyc;
		
	}
	
}
