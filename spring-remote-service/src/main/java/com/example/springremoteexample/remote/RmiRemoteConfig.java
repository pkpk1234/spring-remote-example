package com.example.springremoteexample.remote;

import com.example.springremoteexample.repository.AccountRepository;
import com.example.springremoteexample.serivce.AccountService;
import com.example.springremoteexample.serivce.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Created by pkpk1234 on 2017/6/1.
 */

@Configuration
public class RmiRemoteConfig {

    private final AccountServiceImpl accountService;

    @Autowired
    public RmiRemoteConfig(AccountServiceImpl accountService) {
        this.accountService = accountService;
    }

    @Bean
    public RmiServiceExporter rmiServiceExporter() {
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setServiceName("AccountService");
        rmiServiceExporter.setServiceInterface(AccountService.class);
        rmiServiceExporter.setService(this.accountService);
        rmiServiceExporter.setRegistryPort(2000);
        return rmiServiceExporter;
    }


}
