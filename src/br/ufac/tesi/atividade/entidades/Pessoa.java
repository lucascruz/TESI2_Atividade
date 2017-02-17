package br.ufac.tesi.atividade.entidades;

import javax.persistence.*;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)

@DiscriminatorColumn(name="TIPO")
public

abstract class Pessoa{
	@Id
	private int id;
	
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}