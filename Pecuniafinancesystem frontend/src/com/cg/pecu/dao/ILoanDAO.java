package com.cg.pecu.dao;

import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;

public interface ILoanDAO{
public boolean loanRequest(Loan a);
public boolean loanDisbursal(Loan1 a);
}
