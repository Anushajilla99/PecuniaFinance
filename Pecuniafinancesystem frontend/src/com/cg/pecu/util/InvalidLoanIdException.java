package com.cg.pecu.util;

import com.cg.pecu.exception.LoandeniedException;

@SuppressWarnings({ "serial", "unused" })
	public class InvalidLoanIdException extends Exception{
		public InvalidLoanIdException(String string) {
			
			
		}
public boolean InvalidLoanIdException(String loan_request_id) {
			String s1=(loan_request_id);
			boolean flag=false;
			try {
				if(s1.length()!=12||s1.startsWith("0"))
				{
					flag=true;
					throw new InvalidLoanIdException("Invalid Loan_Request_id");
				}
			}
			catch(InvalidLoanIdException  e){
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			return flag;
		
		}
}
		
