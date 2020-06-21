package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Account;
import com.example.repository.AccountRepository;

@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository;
	
	public String createAccount(Account account) {
		Account account1=  accountRepository.save(account);	
		return "Added successfully";
		}
 
	public Account getAccountDetails(Long accountNUmber) {
		return accountRepository.findById(accountNUmber).get();
	}
	
	public List<Account> retrieveAllAccounts(){
		List<Account> accounts= new ArrayList<>();
		accountRepository.findAll().forEach(account1 -> accounts.add(account1));
		return accounts;
	}
	
	public Account updateAccountDetails(Account account) {
		return accountRepository.save(account);
	}
}
