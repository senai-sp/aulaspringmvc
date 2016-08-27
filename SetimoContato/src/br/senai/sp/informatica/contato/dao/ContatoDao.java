package br.senai.sp.informatica.contato.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.senai.sp.informatica.contato.modelo.Contato;

@Repository
public class ContatoDao {
	@PersistenceContext
	private EntityManager manager;

	public void salvar(Contato contato) {
		manager.persist(contato);
	}
}
