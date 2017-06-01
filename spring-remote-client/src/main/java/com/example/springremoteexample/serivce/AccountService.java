package com.example.springremoteexample.serivce;

import com.example.springremoteexample.model.Account;

import java.util.List;

/**
 * Created by pkpk1234 on 2017/6/1.
 */
public interface AccountService {
    List<Account> getAllAccount();

    Account getAccountById(Long id);

    Account saveOrUpdate(Account account);
}
