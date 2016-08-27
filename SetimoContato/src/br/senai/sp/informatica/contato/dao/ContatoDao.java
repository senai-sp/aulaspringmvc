package br.senai.sp.informatica.contato.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.senai.sp.informatica.contato.modelo.Contato;

@Repository
public class ContatoDao {
	@PersistenceContext
	private EntityManager manager;

	public void salvar(Contato contato) {
		manager.persist(contato);
	}
	
	public List<Contato>listar(){
		TypedQuery<Contato>
			query = 
				manager.createQuery
				("select c from Contato c", Contato.class);
		return query.getResultList();
	}
}
 