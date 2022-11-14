package br.com.gft.tdd.exercicio2.model;

import br.com.gft.tdd.exercicio2.interfaces.Imposto;

public abstract class Produto implements Imposto {
	
	protected String nome;
	protected Double preco;
	protected int qtd;
	
	public Produto(String nome, Double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void calculaImposto() {
		System.out.println("Teste.");
	}
}