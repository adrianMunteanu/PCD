package com.fii;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
public class Application {

	@RequestMapping("/")
	public String home() {
		return "home";
		}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
