package com.w3cjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class JavaWikiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaWikiApplication.class, args);
	}
}
