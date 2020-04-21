package com.cg.pecu.model;

public class Loan {
private String loan_request_id;
private String loan_customer_id;
private double loan_amount;
private String loan_type;
private double loan_emi;
private int loan_year;
private double loan_rol;
private String loan_status;
public Loan(){}

public  Loan(String loan_request_id, String loan_customer_id,double loan_amount,String loan_type, int loan_year,double loan_rol,double loan_emi,String loan_status) {
	super();
	this.loan_request_id = loan_request_id;
	this.loan_customer_id = loan_customer_id;
	this.loan_amount = loan_amount;
	this.loan_type = loan_type;
	this.loan_year = loan_year;
	this.loan_rol = loan_rol;
	this.loan_emi = loan_emi;
	this.loan_status = loan_status;
}
public String getLoan_request_id() {
	return loan_request_id;
}
public void setLoan_request_id(String loan_request_id) {
	this.loan_request_id = loan_request_id;
}
public String getLoan_customer_id() {
	return loan_customer_id;
}
public void setLoan_customer_id(String loan_customer_id) {
	this.loan_customer_id = loan_customer_id;
}
public double getLoan_amount() {
	return loan_amount;
}
public void setLoan_amount(double loan_amount) {
	this.loan_amount = loan_amount;
}
public String getLoan_type() {
	return loan_type;
}
public void setLoan_type(String loan_type) {
	this.loan_type = loan_type;
}
public int getLoan_year() {
	return loan_year;
}
public void setLoan_year(int loan_year) {
	this.loan_year = loan_year;
}
public double getLoan_rol() {
	return loan_rol;
}
public void setLoan_rol(double loan_rol) {
	this.loan_rol = loan_rol;
}
public double getLoan_emi() {
	return loan_emi;
}
public void setLoan_emi(double loan_emi) {
	this.loan_emi = loan_emi;
}
public String getLoan_status() {
	return loan_status;
}
public void setLoan_status(String loan_status) {
	this.loan_status = loan_status;
}
@Override
public String toString() {
	return "Employee [loan_request_id=" + loan_request_id + ", loan_customer_id=" + loan_customer_id + ", loan_amount="
			+ loan_amount + ", loan_type=" + loan_type + ", loan_year=" + loan_year + ", loan_rol=" + loan_rol
			+ ", loan_emi=" + loan_emi + ", loan_status=" + loan_status + "]";
}
}