package br.ufac.tesi.atividade.repositorio;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.ufac.tesi.atividade.entidades.PessoaFisica;
import br.ufac.tesi.atividade.entidades.PessoaJuridica;

public class RepositorioPessoa {

	EntityManagerFactory emf;
	EntityManager em;

	public RepositorioPessoa(){
		emf = Persistence.createEntityManagerFactory("AtividadePU");
		em = emf.createEntityManager();
	}

	public void adicionar(PessoaFisica pessoa){

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
	}
	
	
	public void adicionar(PessoaJuridica pessoa){

		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		
	}
	
	public void encerrar(){
		em.close();
		emf.close();
	}
	

}