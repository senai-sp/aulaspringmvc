package br.senai.sp.informatica.contato.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.informatica.contato.modelo.Contato;
import br.senai.sp.informatica.contato.modelo.Sexo;

@Controller
public class ContatoController {

	@RequestMapping("/formContato")
	public String form(Model model) {
		model.addAttribute("vetorSexos", Sexo.values());
		return "/contato/formulario";
	}

	@RequestMapping("/salvarContato")
	public String salvar(Contato contato) {
		System.out.println(contato.getNome());
		return "/contato/sucesso";
	}
}
