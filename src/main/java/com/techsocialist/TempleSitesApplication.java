package com.techsocialist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TempleSitesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TempleSitesApplication.class, args);
	}

	@GetMapping("/config")
	public String siteConfigHome(){
		return "Admin Configuration Home";
	}

}
