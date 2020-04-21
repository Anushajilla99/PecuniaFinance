package com.capgemini.pecunia.service;

import java.util.List;

import com.capgemini.pecunia.bean.Userdata;

public interface UserService {

	Userdata addUser(Userdata u);


	List<Userdata> getAllUsers();

	Userdata deleteUser(int userId);

	Userdata updateUser(Userdata u);
	
	Boolean adminLoginUser(Userdata u);
	
	Boolean customerLoginUser(Userdata u);

}