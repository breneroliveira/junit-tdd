package br.com.gft.tdd.exercicio2.model;

public class Livro extends Produto {
	
	protected String autor;
	protected String tema;
	protected int qtdPag;
	
	public Livro(String nome, Double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.setAutor(autor);
		this.setTema(tema);
		this.setQtdPag(qtdPag);
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	@Override
	public String toString() {
		String texto = super.toString();
		texto += "\nNome: " + this.getNome() + 
				 "\nPreco: " + this.getPreco() + 
				 "\nQuantidade: " + this.getQtd() + 
				 "\nAutor: " + this.getAutor() + 
				 "\nTema: " + this.getTema() + 
				 "\nQuantidade de paginas: " + this.getQtdPag() + "\n";
		return texto;
	}

	public void calculaImposto() {
		if(this.tema == "educativo") {
			System.out.println("Livro educativo nao tem imposto: " + this.nome + ".");
		} else {
			Double imposto = (this.preco * 10) / 100;
			
			System.out.println("R$" + imposto + " de impostos sobre o livro " + this.nome + ".");
			System.out.println("-----------------------------------------------------------------");
		}
	}
}