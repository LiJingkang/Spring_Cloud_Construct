package com.ljk.serviceribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        // ribbon中它会根据服务名来选择具体的服务实例
        // 会用具体的url替换掉服务名
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name, String.class);
    }
}
