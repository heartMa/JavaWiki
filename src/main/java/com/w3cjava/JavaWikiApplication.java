package com.w3cjava;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan("com.w3cjava.modules.*.mapper")
@EnableTransactionManagement
public class JavaWikiApplication {
	public static void main(String[] args) {
		SpringApplication.run(JavaWikiApplication.class, args);
	}
}
