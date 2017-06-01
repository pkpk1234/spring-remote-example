package com.example.springremoteexample;

import com.example.springremoteexample.client.RmiAccountClient;
import com.example.springremoteexample.model.Account;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringRemoteExampleApplicationTests {

    @Autowired
    private RmiAccountClient rmiAccountClient;

    @Test
    public void findAll() {
        List<Account> accounts = this.rmiAccountClient.getAllAccount();
        log.info("accounts'size is {} ", accounts.size());
    }

}
