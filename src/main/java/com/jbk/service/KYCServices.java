package com.jbk.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.dao.KYCDao;
import com.jbk.entity.KYC;

@Service

public class KYCServices {
	
	@Autowired
	KYCDao kycDao;
	
	public KYC fetchKycDetails(int custId){
	
		return kycDao.fetchKycDetails(custId);
	}

	public KYC fetchKycDetailsBasedOnCustomerName(String custName) {
	
		return kycDao.fetchKycDetailsBasedOnCustomerName(custName);
	}

}
