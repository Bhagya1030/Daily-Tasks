package com.aits.Spring_IOC;

public interface Tax {
	
      void setTaxableAmount(double amount);
		void calculateTaxAmount();
		double getTaxAmount();
		String getTaxType();
		boolean isTaxPayed();
		void PayTax(String Paymode);
}

