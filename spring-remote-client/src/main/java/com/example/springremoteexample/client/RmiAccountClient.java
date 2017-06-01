package com.example.springremoteexample.client;

import com.example.springremoteexample.model.Account;
import com.example.springremoteexample.serivce.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by pkpk1234 on 2017/6/1.
 */

@Component
public class RmiAccountClient {

    private final AccountService accountService;

    @Autowired
    public RmiAccountClient(AccountService accountService) {
        this.accountService = accountService;
    }

    public List<Account> getAllAccount() {
        return this.accountService.getAllAccount();
    }

    public Account getAccountById(Long id) {
        return this.accountService.getAccountById(id);
    }
}
