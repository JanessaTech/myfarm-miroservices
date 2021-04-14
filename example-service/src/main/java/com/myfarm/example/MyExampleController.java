package com.myfarm.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/examples")
public class MyExampleController {
    private Logger logger = LoggerFactory.getLogger(MyExampleController.class);
    @Value("${welcome.msg}")
    private String welcomeInfo;
    @GetMapping(value = "/msg")
    public String getMsg() throws InterruptedException {
        logger.info("===== call in MyExampleController ====");
        return welcomeInfo;
    }
}
