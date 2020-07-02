package com.pucrs.grupo2.Recipes.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "receita")
public class Receita {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long matricula;
	private int registro;
    private String nome;
    

    public Receita() {

    }

    public Receita(int registro, String nome) {
        this.registro = registro;
        this.nome = nome;
    }
    
    
    public Long getMatricula() {
		return matricula;
	}

	
	public int getRegistro() {
		return registro;
	}

	public void setRegistro(int registro) {
		this.registro = registro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Receita [matricula=" + getMatricula() + ", registro=" + getRegistro() + ", nome=" + getNome() + "]";
	}

}