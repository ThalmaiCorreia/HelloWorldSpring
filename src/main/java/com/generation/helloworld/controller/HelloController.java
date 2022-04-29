package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "HELLO WORLD!!";
	}
	@GetMapping("/bsm")
	public String bsm() {
		return "Comunicação <br /> Persistencia";
	}
	@GetMapping("/persistencia")
	public String persistencia() {
		return "Persistência é uma característica daquilo que não desiste fácil."
				+ "Agir com persistência é ser esforçado e focado em seus objetivos, sem se deixar abalar"
				+ "facilmente por quaisquer críticas ou negativas.";
	}

}
