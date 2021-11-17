package com.trial.azureT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureTApplication {

	
	@GetMapping("/")
	public String message()
	{
		return "welcome divya";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(AzureTApplication.class, args);
	}

}
