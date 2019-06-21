package com.wsc.websitesearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
public class WebsiteSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebsiteSearchApplication.class, args);
	}

}
