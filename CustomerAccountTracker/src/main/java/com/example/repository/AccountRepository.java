package com.example.repository;

import java.util.List;

import com.example.model.Account;

public interface AccountRepository {
String addAccount(Account account);
Account getAccount(Long accountNumber);
List<Account> getAllAccounts();
Account updateAccount(Account account);

}
