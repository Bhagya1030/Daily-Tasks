package com.aits.Spring_IOC;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class IncomeTax implements Tax{
      
	//@Autowired
	//PaymentProcessor p;
	Map<String,PaymentProcessor> p;
	@Autowired
	public IncomeTax(Map<String,PaymentProcessor> p) {
		this.p=p;
	}
	//public IncomeTax(@Qualifier("phonepay")PaymentProcessor p) {
		//this.p=p;
	//}
	
    private double taxableAmount;
	
	private double taxAmount;
	
	private boolean isTaxPayed=false;
	
	private String taxType="Savings";
 
	@Override
	public void setTaxableAmount(double amount) {
		
		this.taxableAmount=amount;
		
	}
 
	@Override
	public void calculateTaxAmount() {
		
		if(this.taxableAmount >=0 && this.taxableAmount<=500000) {
			
			this.taxAmount=(this.taxableAmount *0.05);
			
		}
		
		System.out.println(this.taxAmount);
		
		
	}
 
	@Override
	public double getTaxAmount() {
		
		return this.taxAmount;
	}
 
	@Override
	public String getTaxType() {
		
		return this.taxType;
	}
 
	@Override
	public boolean isTaxPayed() {
		
		return isTaxPayed;
		
	}
 
	@Override
	public void PayTax(String paymode) {
		
		PaymentProcessor pp=p.get(paymode);
		pp.doPayment();
		isTaxPayed=true;
		
		
		
	}
}
