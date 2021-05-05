package com.techsocialist.templesite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TempleSiteConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(TempleSiteConfiguration.class, args);
	}

	@GetMapping("/configuration")
	public String configuration(){
		return "Admin Configuration Home";
	}

	@GetMapping("/configuration/site")
	public String siteConfiguration(){
		return "Site Configuration Home";
	}

	@GetMapping("/configuration/site/admin")
	public String siteAdminConfiguration(){
		return "Site admin Configuration Home";
	}

	@GetMapping("/configuration/site/theme")
	public String siteThemeConfiguration(){
		return "Site theme Configuration Home";
	}

}
