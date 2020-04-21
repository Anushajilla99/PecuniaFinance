package com.cg.pecu.dao.Test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Request;
import org.mockito.Mockito;

import com.cg.pecu.dao.ILoanDAO;
import com.cg.pecu.dao.LoanDAO;
import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;

@SuppressWarnings("unused")
public class LoanDAOTest {
	//@Mock
	private ILoanDAO  mockLoanDAO;
//@SuppressWarnings("unused")
private ILoanDAO mockLoan1DAO;
	ILoanDAO idao1;
	Loan a;

	@Before
	public void setUp() throws Exception {
		mockLoanDAO=Mockito.mock(LoanDAO.class);
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoanRequest() {
		Loan l= new Loan("qwe","asd",5672.24,"uio",78,7892.12,1234.11,"yuir");
		Mockito.when(mockLoanDAO.loanRequest(l)).thenReturn(true);
		assertTrue(mockLoanDAO.loanRequest(l)==true);
		Mockito.verify(mockLoanDAO).loanRequest(l);
		//fail("Not yet implemented");
	}
	@Test
	public void testLoanDisbursal() 
	{
		Loan1 l1= new Loan1("qwe","asd","uio",7892.12,1234.11,"yuir",1234.56);
		Mockito.when(mockLoanDAO.loanDisbursal(l1)).thenReturn(true);
		assertTrue(mockLoanDAO.loanDisbursal(l1)==true);
		Mockito.verify(mockLoanDAO).loanDisbursal(l1);
		
	//	fail("Not yet implemented");
	}

}
