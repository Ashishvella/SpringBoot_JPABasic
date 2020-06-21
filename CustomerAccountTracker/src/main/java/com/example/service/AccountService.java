package com.example.service;

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
		return accountRepository.addAccount(account);
	}
 
	public Account getAccountDetails(Long accountNUmber) {
		return accountRepository.getAccount(accountNUmber);
	}
	
	public List<Account> retrieveAllAccounts(){
		return accountRepository.getAllAccounts();
	}
	
	public Account updateAccountDetails(Account account) {
		return accountRepository.updateAccount(account);
	}
}
