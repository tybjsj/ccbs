package com.ccbs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CcbsApplication {

	@RequestMapping("/hello")
	public String sayhello() {
		return "hello world";
	}
	
	@RequestMapping("/hello1")
	public String sayhello1() {
		return "hello world22";
	}
	public static void main(String[] args) {
		SpringApplication.run(CcbsApplication.class, args);
	}

}
