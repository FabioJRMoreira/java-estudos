package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class PaginaInicial {
	@GetMapping("/")
	String home() {
		return "Olá Sping Boot";
	}

}
