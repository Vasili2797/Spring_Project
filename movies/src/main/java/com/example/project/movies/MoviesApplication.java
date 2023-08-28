package com.example.project.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/")
	public String apiRoot(){
		String link="<p><a href='/homepage'>The address</a></p>";
		return "Hello, World \n"+link;
	}
	@GetMapping("/homepage")
	public String homePageMessage(){
		return "This is the homepage that you just went onto";
	}
}