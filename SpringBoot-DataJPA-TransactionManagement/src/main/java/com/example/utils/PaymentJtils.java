package com.example.utils;

import java.util.HashMap;
import java.util.Map;

import com.example.exception.InsufficientAmountException;

public class PaymentJtils {
	private static Map<String, Double> paymentmap=new HashMap<>() ;
	
	static{
		paymentmap.put("acc1", 10000.00);
		paymentmap.put("acc2", 12000.00);
		paymentmap.put("acc3", 13000.00);
		paymentmap.put("acc4", 6000.00);

		
	}
	public static boolean validatecreaditlimit(String accno,double amount) {
		if(amount>paymentmap.get(accno)){
			throw new InsufficientAmountException("insufficientamount exception");
			
		}else {
			return true;

		}
		
	}

}
