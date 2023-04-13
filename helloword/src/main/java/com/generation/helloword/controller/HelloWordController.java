package com.generation.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class HelloWordController {
	
	@GetMapping
	public String helloWord() {
		return "<b>Hello Turma 62!</b>";
		
		
	}
	@GetMapping("/BSM's" )
	public String bsm() {
		return "<b>Mentalidade de Crescimento, Persistência, Responsabilidade Pessoal,Orientação ao futuro,comunicação,Orientação ao detalhe</b>";
	}

	@GetMapping("/obj")
	public String obj() {
		return "<b>Orientação aos detalhes,Comunicação</b>";
		
		
	}
	
}
