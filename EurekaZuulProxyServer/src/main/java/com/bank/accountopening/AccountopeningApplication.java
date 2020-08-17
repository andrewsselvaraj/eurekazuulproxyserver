package com.bank.accountopening;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class AccountopeningApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountopeningApplication.class, args);
	}

}
