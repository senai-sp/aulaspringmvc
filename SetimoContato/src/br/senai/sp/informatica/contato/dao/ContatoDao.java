package br.senai.sp.informatica.contato.dao;

import javax.persistence.EntityManager;

import br.senai.sp.informatica.contato.modelo.Contato;

public class ContatoDao {
	private EntityManager manager;

	public void salvar(Contato contato) {
		manager.persist(contato);
	}
}
