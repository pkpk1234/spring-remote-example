package com.example.springremoteexample.serivce;

import com.example.springremoteexample.model.Account;
import com.example.springremoteexample.repository.AccountRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pkpk1234 on 2017/6/1.
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;

    @Autowired
    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public List<Account> getAllAccount() {
        return this.accountRepository.findAll();
    }

    @Override
    public Account getAccountById(Long id) {
        return this.accountRepository.findOne(id);
    }

    @Override
    public Account saveOrUpdate(Account account) {
        return this.accountRepository.save(account);
    }
}
