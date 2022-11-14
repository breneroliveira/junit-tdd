package br.com.gft.tdd.exercicio7;

import java.io.Serializable;

public class Funcionario implements Serializable {

	private String nome;
	private int idade;
	private Double salario;
	
	public Funcionario(String nome, int idade, Double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double bonificacao(Double salario) {
		return salario;
	}
}