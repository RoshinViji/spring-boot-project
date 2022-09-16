package com.example.mypkg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;


@SpringBootApplication
public class MyproApplication {
	 @RequestMapping(value="/web")
	
	public String index() {
		return "<h1>Roshin<h1>";
	}

	public static void main(String[] args) {
		SpringApplication.run(MyproApplication.class, args);
	}

}
