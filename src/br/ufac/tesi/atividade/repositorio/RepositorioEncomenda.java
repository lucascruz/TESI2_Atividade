package br.ufac.tesi.atividade.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.ufac.tesi.atividade.entidades.Encomenda;


public class RepositorioEncomenda {

	EntityManagerFactory emf;
	EntityManager em;

	public RepositorioEncomenda(){
		emf = Persistence.createEntityManagerFactory("AtividadePU");
		em = emf.createEntityManager();
	}

	public void adicionar(Encomenda encomenda){

		em.getTransaction().begin();
		em.persist(encomenda);
		em.getTransaction().commit();
		
	}
	
	public Encomenda recuperar(int id){
		return em.find(Encomenda.class, id);
	}
	
	public void atualizar(Encomenda encomenda){
		em.getTransaction().begin();
		em.merge(encomenda);
		em.getTransaction().commit();
	}
	
	public void remover(Encomenda encomenda){
		em.getTransaction().begin();
		em.remove(encomenda);
		em.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Encomenda> recuperarTodos(){

		Query qrEncomendas = em.createQuery("select Encomenda from Encomenda Encomenda");
		
		return qrEncomendas.getResultList();
	}
	
	public void encerrar(){
		em.close();
		emf.close();
	}

}
