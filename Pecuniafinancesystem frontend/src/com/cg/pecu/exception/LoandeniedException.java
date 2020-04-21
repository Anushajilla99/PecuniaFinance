package com.cg.pecu.exception;

@SuppressWarnings("serial")
public class LoandeniedException extends Exception {
	public LoandeniedException(String msg) {
		System.out.println("Loan denied");
	}
	}