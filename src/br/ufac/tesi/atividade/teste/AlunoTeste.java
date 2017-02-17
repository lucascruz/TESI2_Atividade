package br.ufac.tesi.atividade.teste;

import br.ufac.tesi.atividade.entidades.PessoaFisica;
import br.ufac.tesi.atividade.entidades.PessoaJuridica;
import br.ufac.tesi.atividade.repositorio.RepositorioPessoa;

public class AlunoTeste {

	public static void main(String[] args) {

		RepositorioPessoa ar = new RepositorioPessoa();
	
		PessoaFisica a = new PessoaFisica();
		PessoaJuridica b = new PessoaJuridica();
		
		a.setNome("Macilon");
		a.setId(40);
		b.setNome("Teste");
		b.setCnpj("asdhuasdhau");
		b.setId(2);
		ar.adicionar(a);
		ar.adicionar(b);
		
	}

}
