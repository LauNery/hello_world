package com.turmajava81.atividadepraticamodulo23.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class AtividadeModulo23Controller {

	@GetMapping
	public String helloworld() {
		return "Hello World!";
	}

	@GetMapping(value = "/bsm", produces = "text/plain")
	public String bsm() {
		return " A lista de BSM’s da Generation Brasil:\n "
				+ "\n-- Orientação ao Futuro" 
				+ "\n-- Responsabilidade Pessoal"
				+ "\n-- Mentalidade de Crescimento"
				+ "\n-- Persistência"
				+ "\n-- Trabalho em Equipe"
				+ "\n-- Atenção aos Detalhes"
				+ "\n-- Proatividade"
				+ "\n-- Comunicação";
	}

	@GetMapping(value = "/objetivos", produces = "text/plain")
	public String objetivos() {
		return " A lista de aprendizagem com os objetivos desta semana:\n"
				+ "\n-- MySQL"
				+ "\n-- Relacionais"
				+ "\n-- Não Relacionais"
				+ "\n-- Banco de Dados"
				+ "\n-- Back-end";
	}
}
