package com.example.springremoteexample;

import com.example.springremoteexample.model.Account;
import com.example.springremoteexample.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringRemoteExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRemoteExampleApplication.class, args);
    }
}

@Component
class Init implements CommandLineRunner {

    @Autowired
    AccountRepository accountRepository;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Account account1 = new Account("name1", 20);
        this.accountRepository.save(account1);
        Account account2 = new Account("name1", 20);
        this.accountRepository.save(account2);
        Account account3 = new Account("name1", 20);
        this.accountRepository.save(account3);
    }
}
