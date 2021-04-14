package com.myfarm.ribbonexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@LoadBalancerClient(name = "example")
@RestController
@RequestMapping("/ribbon/examples")
public class RibbonExampleApplication {
    private Logger logger = LoggerFactory.getLogger(RibbonExampleApplication.class);
    @LoadBalanced
    @Bean
    RestTemplate restTemplate(){
        return new RestTemplate();
    }

    // test http://127.0.0.1:9050/ribbon/examples/msg
    @GetMapping("/msg")
    public String getMsg(){
        logger.info("==== call in RibbonExampleApplication");
        return restTemplate().getForObject("http://example/examples/msg", String.class);
    }

    public static void main(String[] args){
        SpringApplication.run(RibbonExampleApplication.class, args);
    }
}
