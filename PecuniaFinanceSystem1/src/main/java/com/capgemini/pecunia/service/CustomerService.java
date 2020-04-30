package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.bean.Customerdata;

public interface CustomerService {

	Customerdata addCustomer(Customerdata c);

	Boolean login(Customerdata c);

	List<Customerdata> getAllCustomers();

	Customerdata deleteCustomer(int customerId);

	Customerdata updateCustomer(Customerdata c);
	
	Boolean adminLoginCustomer(Customerdata c);

}