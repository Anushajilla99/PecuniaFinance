package com.cg.pecu.util;

import com.cg.pecu.exception.LoandeniedException;

@SuppressWarnings({ "serial", "unused" })
public class InvalidAmountException  extends Exception{
		public InvalidAmountException(String string) {
			System.out.println("Invalid LoanAmount");
}

public boolean InvalidAmountException(double loan_amount) {
			String s2=Double.toString(loan_amount);
			boolean flag1=false;
			try{
				if(loan_amount>1000&& loan_amount<10000000||s2.startsWith("0"))
				{
					flag1=true;
					throw new InvalidAmountException("Invalid Amount");
				}
			}
			catch(InvalidAmountException e){
				e.printStackTrace();
			}
			return flag1;
		}
	}

