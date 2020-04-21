package com.cg.pecu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;
import com.cg.pecu.util.DbConn;

public class LoanDAO implements ILoanDAO {
    	public boolean loanRequest(Loan a) {
    		boolean flag= false;
	try {
		Connection con=com.cg.pecu.util.DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into Loanrequest values(?,?,?,?,?,?,?,?)");
		pst.setString(1,a.getLoan_request_id());
		pst.setString(2,a.getLoan_customer_id());
		pst.setDouble (3,a.getLoan_amount());
		pst.setString(4,a.getLoan_type());
		pst.setInt(5,a.getLoan_year());
		pst.setDouble(6,a.getLoan_rol());
		pst.setDouble(7,a.getLoan_emi());
		pst.setString(8,a.getLoan_status());
		pst.execute();
		System.out.println("insertion done successfully...loan application received);");
		flag=true;
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
}
public boolean loanDisbursal(Loan1 a) {
	boolean flag= false;
	try {
		Connection con=DbConn.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into loandisbursed values (?,?,?,?,?,?,?)");
		pst.setString(1,a.getLoan_id());
		pst.setString(2,a.getLoan_cust_acc_id());
		pst.setString(3,a.getLoan_process_id());
		pst.setDouble (4,a.getLoan_amt_disbursed());
		pst.setDouble (5,a.getLoan_amt_paid());
		pst.setString(6,a.getLoan_due_date());
		pst.setDouble (7,a.getLoan_emi());
		
			pst.execute();
		System.out.println("loan disbursed successfully...);");
		
		flag= true;
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
}
	
}

    