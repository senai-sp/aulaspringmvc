package br.senai.sp.informatica.contato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.senai.sp.informatica.contato.dao.ContatoDao;
import br.senai.sp.informatica.contato.modelo.Contato;
import br.senai.sp.informatica.contato.modelo.Sexo;

@Controller
public class ContatoController {
	@Autowired
	private ContatoDao dao;

	@RequestMapping("/formContato")
	public String form(Model model) {
		model.addAttribute("vetorSexos", Sexo.values());
		return "/contato/formulario";
	}

	@Transactional
	@RequestMapping("/salvarContato")
	public String salvar(Contato contato) {
		dao.salvar(contato);
		return "/contato/sucesso";
	}
}
