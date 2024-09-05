package com.jbk.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jbk.entity.KYC;

@Repository
public class KYCDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public KYC fetchKycDetails(int custId) {
		// hibernate code 
		
		Session session = sessionFactory.openSession();
		KYC kyc = session.load(KYC.class, custId);
		
		System.err.println(kyc);
				
		return kyc;
		
	}

	public KYC fetchKycDetailsBasedOnCustomerName(String custName) {
		Session session = sessionFactory.openSession();
		KYC kyc = session.load(KYC.class, custName);
		
		System.err.println(kyc);
				
		return kyc;
	}

}
