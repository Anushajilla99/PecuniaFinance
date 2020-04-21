package com.cg.pecu.service;

import com.cg.pecu.dao.ILoanDAO;
import com.cg.pecu.dao.LoanDAO;
import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;

public  class LoanService implements ILoanService{
	ILoanDAO adao=new LoanDAO();
   public boolean LoanRequest(Loan a){
	  return adao.loanRequest(a);
   }  
	  public boolean LoanDisbursed(Loan1 a){
		  return adao.loanDisbursal(a);
	  }
	
}
	 
