package com.farm.hystrix;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExampleService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "alternative")
    public String getMsg(){
        return restTemplate.getForObject("http://127.0.0.1:9001/examples/msg", String.class);
    }

    public String alternative(){
        return "alternative";
    }
}
