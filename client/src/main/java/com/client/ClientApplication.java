package com.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class ClientApplication {
	
	@Value("${app.password}")
	String pwd;

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
	
	@GetMapping("/")
	public String getPwd() {
		return pwd;
	}
}
