package br.ufac.tesi.atividade.teste;


import br.ufac.tesi.atividade.entidades.Destino;
import br.ufac.tesi.atividade.entidades.Encomenda;
import br.ufac.tesi.atividade.repositorio.RepositorioEncomenda;

public class EncomendaTeste {
	
	public static void main(String[] args) {


	RepositorioEncomenda ar = new RepositorioEncomenda();
	Encomenda a = new Encomenda();
	Destino b = new Destino();
	
	a.setDescricao("Macilon");
	b.setDestino("888888");
	a.setDestino(b);
	a.setId(12);
	ar.adicionar(a);
	ar.encerrar();
}
}
