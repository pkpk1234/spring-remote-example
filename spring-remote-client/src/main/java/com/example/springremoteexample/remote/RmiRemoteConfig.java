package com.example.springremoteexample.remote;

import com.example.springremoteexample.serivce.AccountService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Created by pkpk1234 on 2017/6/1.
 */

@Configuration
public class RmiRemoteConfig {

    @Value("${service.url}")
    private String serviceUrl;

    @Bean
    public AccountService rmiServiceExporter() {
        RmiProxyFactoryBean rmiProxyFactoryBean = new RmiProxyFactoryBean();
        rmiProxyFactoryBean.setServiceUrl(serviceUrl);
        rmiProxyFactoryBean.setServiceInterface(AccountService.class);
        final Object object = rmiProxyFactoryBean.getObject();
        return AccountService.class.cast(object);
    }


}
