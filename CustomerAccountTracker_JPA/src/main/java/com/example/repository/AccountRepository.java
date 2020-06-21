package com.example.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {

	
	}
	/*
	 * String addAccount(Account account); Account getAccount(Long accountNumber);
	 * List<Account> getAllAccounts(); Account updateAccount(Account account);
	 */

