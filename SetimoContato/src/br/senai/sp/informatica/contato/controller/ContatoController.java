package br.senai.sp.informatica.contato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContatoController {

	@RequestMapping("/formContato")
	public String form() {
		return "/contato/formulario";
	}
}
