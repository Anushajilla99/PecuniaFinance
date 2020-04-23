package com.capgemini.pecunia.controller;

import java.util.List;

import com.capgemini.pecunia.exceptions.IdNotFoundException;
import com.capgemini.pecunia.service.AccountService;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.capgemini.pecunia.bean.Account;

@RestController
@RequestMapping("/account")
//@CrossOrigin("http://localhost:4200")
public class AccountController {
	@Autowired
	AccountService serviceobj;

	
	@PostMapping("/AccountCreation")
	public ResponseEntity<String> accountCreation(@RequestBody Account ac) {
		Account a = serviceobj.accountCreation(ac);
		if (a == null) {
			throw new IdNotFoundException("Enter Valid Id");
		} else {
			return new ResponseEntity<String>(" created successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	
	@GetMapping("/GetAccount/{accountnumber}")
	private ResponseEntity<Account> getEmployee(@PathVariable("accountnumber") int accountnumber) {
		Account a = serviceobj.getAccountByAccnum(accountnumber);
		if (a == null) {
			throw new IdNotFoundException("Id does not exist,so we couldn't fetch details");
		} else {
			return new ResponseEntity<Account>(a, new HttpHeaders(), HttpStatus.OK);
		}
	}

	
	@GetMapping("/GetAllAccounts")
	private ResponseEntity<List<Account>> getAllaccount() {
		List<Account> aclist = serviceobj.getAllAccount();
		return new ResponseEntity<List<Account>>(aclist, new HttpHeaders(), HttpStatus.OK);

	}

	
	@PutMapping("/UpdateAccount")
	public ResponseEntity<String> updateAccount(@RequestBody Account ac) {
		Account a = serviceobj.updateAccount(ac);
		if (a == null) {
			throw new IdNotFoundException("Update Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("Account updated successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	
	@DeleteMapping("/DeleteAccount/{accountnumber}")
	private ResponseEntity<String> delAc(@PathVariable("accountnumber") int accountnumber) {
		Account a = serviceobj.deleteByAccountnum(accountnumber);
		if (a == null) {
			throw new IdNotFoundException("Delete Operation Unsuccessful,Provided Id does not exist");
		} else {
			return new ResponseEntity<String>("Account deleted successfully", new HttpHeaders(), HttpStatus.OK);
		}
	}

	@ExceptionHandler(IdNotFoundException.class)
	public ResponseEntity<String> userNotFound(IdNotFoundException e) {
		return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
	}
}
