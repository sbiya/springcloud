package com.icss.springcloud.singleproject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class TestController {
    private final static Logger logger = LoggerFactory.getLogger(TestController.class);
    @Value("${server.port}")
    private String port;
    @RequestMapping("/msg")
    public String client() throws Exception {
        System.out.println(1111111);
        for (int i = 0; i < 100; i++) {
            logger.info("i={}",i);
//            Thread.sleep(1000);
        }

        try {
            int a=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("{} error=",e);
        }
        return "hello....2222222222------port："+port;
    }
}
