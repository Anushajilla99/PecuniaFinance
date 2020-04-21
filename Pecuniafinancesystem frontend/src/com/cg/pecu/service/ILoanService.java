package com.cg.pecu.service;

import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;

public interface ILoanService {
	
	public boolean LoanRequest(Loan a);

	public boolean LoanDisbursed(Loan1 a);
    
}
