package com.capgemini.pecunia.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.pecunia.bean.Transaction;
import com.capgemini.pecunia.service.PassbookMaintenanceService;



@RestController
@RequestMapping("/bank")
@CrossOrigin(origins = "http://localhost:4200")
public class PassbookController {

	@Autowired
	private PassbookMaintenanceService service;
	

	//printing the statements till last updated date
	@GetMapping("/updatePassbook/{accountId}")
	public List<Transaction> updatePassbook(@PathVariable("accountId") int accountId)
	{
			System.out.println("controller"+accountId);
			List<Transaction> list = service.updatePassbook(accountId);
			service.updatelastUpdated(accountId);
			return list;
	}

	//Updating the last updated date everytime
	@PutMapping("/lastUpdate")
	public void updateLastUpdated(@PathVariable int accountId){
		 service.updatelastUpdated(accountId);
		 
	}
	
	@GetMapping("/accountSummary/{accountId}/{startDate}/{endDate}")
	public ResponseEntity<List<Transaction>> accountSummary(@PathVariable int accountId, @PathVariable Date startDate, @PathVariable Date endDate)
	{
		System.out.println(accountId);
		System.out.println(startDate);
		System.out.println(endDate);
		System.out.println("in controller");

		List<Transaction> list = service.accountSummary(accountId, startDate, endDate);
		return new ResponseEntity<List<Transaction>>(list, new HttpHeaders(), HttpStatus.OK);
	}

}
	
