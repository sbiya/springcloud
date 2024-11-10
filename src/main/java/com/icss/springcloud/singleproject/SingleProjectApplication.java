package com.icss.springcloud.singleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//@MapperScan({"com.icss.springcloud.SingleProjectApplication.mapper"})
//@EnableHystrix
//@EnableCircuitBreaker
public class SingleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SingleProjectApplication.class, args);
	}

}
