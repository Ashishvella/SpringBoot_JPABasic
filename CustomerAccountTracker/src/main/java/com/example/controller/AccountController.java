package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.RestException.ResourceNotFoundException;
import com.example.model.Account;
import com.example.service.AccountService;

@Controller
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@GetMapping(value="/")
	@ResponseBody
	public String test() {
		return "Welcome to CustomerAccountTracker Application";
	}
	
	@GetMapping(value="/accounts")
	@ResponseBody
	public List<Account> listAllAccounts() throws ResourceNotFoundException{
		List<Account> list = accountService.retrieveAllAccounts();
		if(list.size()==0) {
			throw new ResourceNotFoundException("No Accounts Present in System");
		}
		return list;
	}
	
	/*
	 * @GetMapping(value="/account/{acctNumber}")
	 * 
	 * @ResponseBody public Account
	 * getAccountByAccountNumber(@PathVariable("acctNumber") Long accountNumber) {
	 * return accountService.getAccountDetails(accountNumber); }
	 */
	
	@GetMapping(value="/account/{acctNumber}")
	@ResponseBody
	public ResponseEntity<Account> getAccountByAccountNumber(@PathVariable("acctNumber") Long accountNumber) throws ResourceNotFoundException {
		Account account= accountService.getAccountDetails(accountNumber);
		if(account==null) {
			throw new ResourceNotFoundException("Account Not Available");
		}
		return new ResponseEntity<>(account,HttpStatus.OK);
		}
	
		/*
		 * @PostMapping(value="/account")
		 * 
		 * @ResponseBody public String addAccount(@RequestBody Account account) {
		 * accountService.createAccount(account); return "Addition Successful"; }
		 */
	
	@PostMapping(value="/account")
	@ResponseBody
	public ResponseEntity<Account> addAccount(@RequestBody Account account) {
		accountService.createAccount(account);
		return new ResponseEntity<Account>(HttpStatus.CREATED);
	}
	
	@PutMapping(value="/account")
	@ResponseBody
	public Account updateAccount(@RequestBody Account account) {
		return accountService.updateAccountDetails(account); 
	}
	}
