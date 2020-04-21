package com.cg.pecu.model;
public class Loan1{
private String loan_id;
private String loan_cust_acc_id;
private String loan_process_id;
private double loan_amt_disbursed;
private double loan_amt_paid;
private String loan_due_date;
private double loan_emi;
public Loan1() {}
public Loan1(String loan_id, String loan_cust_acc_id, String loan_process_id, double loan_amt_disbursed,
		double loan_amt_paid, String loan_due_date, double loan_emi) {
	this.loan_id = loan_id;
	this.loan_cust_acc_id = loan_cust_acc_id;
	this.loan_process_id = loan_process_id;
	this.loan_amt_disbursed = loan_amt_disbursed;
	this.loan_amt_paid = loan_amt_paid;
	this.loan_due_date = loan_due_date;
	this.loan_emi = loan_emi;
}
public String getLoan_id() {
	return loan_id;
}
public void setLoan_id(String loan_id) {
	this.loan_id = loan_id;
}
public String getLoan_cust_acc_id() {
	return loan_cust_acc_id;
}
public void setLoan_cust_acc_id(String loan_cust_acc_id) {
	this.loan_cust_acc_id = loan_cust_acc_id;
}
public String getLoan_process_id() {
	return loan_process_id;
}
public void setLoan_process_id(String loan_process_id) {
	this.loan_process_id = loan_process_id;
}
public double getLoan_amt_disbursed() {
	return loan_amt_disbursed;
}
public void setLoan_amt_disbursed(double loan_amt_disbursed) {
	this.loan_amt_disbursed = loan_amt_disbursed;
}
public double getLoan_amt_paid() {
	return loan_amt_paid;
}
public void setLoan_amt_paid(double loan_amt_paid) {
	this.loan_amt_paid = loan_amt_paid;
}
public String getLoan_due_date() {
	return loan_due_date;
}
public void setLoan_due_date(String loan_due_date) {
	this.loan_due_date = loan_due_date;
}
public double getLoan_emi() {
	return loan_emi;
}
public void setLoan_emi(double loan_emi) {
	this.loan_emi = loan_emi;
}
@Override
public String toString() {
	return "Loan1 [loan_id=" + loan_id + ", loan_cust_acc_id=" + loan_cust_acc_id + ", loan_process_id="
			+ loan_process_id + ", loan_amt_disbursed=" + loan_amt_disbursed + ", loan_amt_paid=" + loan_amt_paid
			+ ", loan_due_date=" + loan_due_date + ", loan_emi=" + loan_emi + "]";
}
}