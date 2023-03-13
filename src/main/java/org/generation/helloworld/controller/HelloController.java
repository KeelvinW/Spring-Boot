package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//indicar para o spring que essa é uma classe controladora
@RestController

//indica um endpoint para nossa aplicalção
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String helloworld() {
		return "Olá Mundo!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "<br>BSMs da Generation Brasil</br>" +
				"<br>- Persistência</br>" +
				"<br>- Mentalidade de Crescimento</br>" +
				"<br>- Orientação ao Futuro</br>" +
				"<br>- Responsabilidade Pessoal</br>" +
				"<br>- Trabalho em Equipe</br>" +
				"<br>- Comunicação</br>" +
				"<br>- Comunicação Não Violenta</br>" +
				"<br>- Atenção para Detalhes</br>" +
				"<br>- Proatividade</br>";
	}
	
	@GetMapping("/objetivo")
	public String objetivos() {
		return "<br>objetivos de aprendizagem</br>" + 
			   "<br>Gestão de tempo</br>" +
			   "<br>Organização</br>" +
			   "<br>Me atentar aos detalhes</br>" +
			   "<br>Entregat minhas atividades com antecedência</br>";
			   
	}
}
