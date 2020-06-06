package br.com.dell.lead.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OlaMundoController {
	
	@GetMapping("/olaMundo")
	public String primerioRetorno() {
		System.out.println("Olá mundo");
		return "olaMundoJSP";
	}
	

}
