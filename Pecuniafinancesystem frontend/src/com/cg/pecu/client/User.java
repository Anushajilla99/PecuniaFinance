package com.cg.pecu.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.cg.pecu.model.Loan;
import com.cg.pecu.model.Loan1;
import com.cg.pecu.service.ILoanService;
import com.cg.pecu.service.LoanService;
import com.cg.pecu.util.InvalidAmountException;
import com.cg.pecu.util.InvalidLoanIdException;
import com.cg.pecu.util.UserValidation;


@SuppressWarnings("unused")
public class User{
public static void main(String[] args) throws Exception{
BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	int op=0;
	do{
    	System.out.println("MENU");
    	System.out.println("1.check for loan request");
    	System.out.println("2.check for loan disbursal");
        System.out.println("3.Exit");
        ILoanService iservice=new LoanService();
   System.out.println("Choose your option: ");
	op=Integer.parseInt(sc.readLine());
  switch(op){  
case 1:{
	try{
	System.out.println("enter Loan_request_id,customer_id,Amount,Type,year,rol,emi,status");
	System.out.println("enter Loan_request_id");
	    String loan_request_id=sc.readLine();
	    System.out.println("enter Loan_customer_id");
		String loan_customer_id=sc.readLine();
		System.out.println("enter loan amount");
	    double loan_amount=Double.parseDouble(sc.readLine());
		System.out.println("enter Loan_type");
		String loan_type=sc.readLine();
		System.out.println("enter Loan_year");
		int loan_year=Integer.parseInt(sc.readLine());
		System.out.println("enter loan_rol");
		double loan_rol=Double.parseDouble(sc.readLine());
		System.out.println("enter Loan_emi");
		double loan_emi=Double.parseDouble(sc.readLine());
		System.out.println("enter Loan_status");
		String loan_status=(sc.readLine());
		Loan l=new Loan(loan_request_id,loan_customer_id,loan_amount,loan_type,loan_year,loan_rol,loan_emi,loan_status);
	    iservice.LoanRequest(l);
	}
	    catch(IOException e)
	    {
	    	e.printStackTrace();
	    }
		break;
	
}
	case 2:{
		
		System.out.println("enter laon id,cust acc id,process id,Amount disbursed, amount paid,due date,emi");
		System.out.println("loan_id(String)");
		String loan_id=sc.readLine();
		System.out.println("loan_cust_acc_id(String");
		 String loan_cust_acc_id=sc.readLine();
		 System.out.println("loan_process_id(String)");
		 String loan_process_id=sc.readLine();
		 System.out.println("loan_amt_disbursed(double)");
			double loan_amt_disbursed=Double.parseDouble(sc.readLine());
			System.out.println("loan_amt_paid(double)");
			double loan_amt_paid=Double.parseDouble(sc.readLine());
			System.out.println("loan_due_date(String)");
			 String loan_due_date=sc.readLine();
			 System.out.println("loan_emi (double)");
			 double loan_emi=Double.parseDouble(sc.readLine());

		Loan1 a=new Loan1(loan_id,loan_cust_acc_id,loan_process_id,loan_amt_disbursed,loan_amt_paid,loan_due_date,loan_emi);
			iservice.LoanDisbursed(a);

		System.out.println("enter true if you accept the loan else enter false");
		String accept=sc.readLine();
		
		if(accept.equals("yes")){
			iservice.LoanDisbursed(a);
			System.out.println("loan approved");}
	
			else{
				System.out.println("loan rejected");

		break;
			}
		}
	case 3:{
		 System.exit(0);
	}
	}
	}while (op<=4);
}

}
