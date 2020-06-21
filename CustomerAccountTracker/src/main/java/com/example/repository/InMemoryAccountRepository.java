package com.example.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Account;

@Repository
public class InMemoryAccountRepository implements AccountRepository {
	
	public HashMap<Long, Account> accountDB= new HashMap<>();

	@Override
	public String addAccount(Account account) {
		accountDB.put(account.getAccountNumber(), account);
		return "Updated SuccessFully";
	}

	@Override
	public Account getAccount(Long accountNumber) {
		Account account =  accountDB.get(accountNumber);
		return account;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return new ArrayList(accountDB.values());
	}

	@Override
	public Account updateAccount(Account account) {
		if(getAccount(account.getAccountNumber())== null) {
			return null;
		}
		Account updatedAccount = new Account(account.getAccountNumber(), account.getType(),account.getBalance());
		accountDB.replace(account.getAccountNumber(), updatedAccount);
		return updatedAccount;
	}

}
