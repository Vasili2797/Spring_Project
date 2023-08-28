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
	public String homepage(){
		return "<p><a href='homepage.html'>click here to enter the page</a></p>";
	}
	@GetMapping("/newMessage")
	public String homePageMessage(){
		return "This is the homepage that you just went onto";
	}
}