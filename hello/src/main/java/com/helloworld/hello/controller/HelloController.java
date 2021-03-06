package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Generation!!!";
	}
	
	@GetMapping("/objetivos")
    public String objetivos() {
        return "<b>Objetivo de aprendizagem da semana:</b>"
                + "<br /> "
                + "<br /> Aprender a fazer um CRUD no Spring!";
	}
	
	
		@GetMapping ("/Bsm")
		public String BSM() {
			return "<b>Mentalidades</b>"
	                + "<br /> "
	                + "<br /> Orientação ao futuro"
	                + "<br /> Responsabilidade pessoal"
	                + "<br /> Mentalidade de crescimento"
	                + "<br /> Persistência"
	                + "<br /> "
	                + "<br /> <b>Habilidades</b>"
	                + "<br /> "
	                + "<br /> Trabalho em equipe"
	                + "<br /> Atenção aos detalhes"
	                + "<br /> Proatividade"
	                + "<br /> Comunicação";
			
			
}
}
