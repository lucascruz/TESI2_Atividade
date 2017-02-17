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
		a.setCpf("123131");
		a.setId(12);
		b.setNome("Teste");
		b.setCnpj("asdhuasdhau");
		b.setId(3);
		ar.adicionar(a);
		ar.adicionar(b);
		ar.encerrar();
	}

}
