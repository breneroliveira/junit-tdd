package br.com.gft.tdd.exercicio2.model;

import java.util.List;

public class Loja {
	
	protected String nome;
	protected String cnpj;
	protected List<Livro> livros;
	protected List<VideoGame> videoGames;
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setLivros(livros);
		this.setVideoGames(videoGames);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	public String listaLivros() {
		String teste = "";
		if(livros.isEmpty()) {
			teste += "A loja nao tem livros no seu estoque.";
		} else {			
			for(Livro livro : livros) {
				teste += "Titulo: " + livro.nome 
					  + ", preco: " + livro.preco 
					  + ", quantidade: " + livro.qtd 
					  + " em estoque.\n";
			}
		}
		return teste;
	}
	
	public String listaVideoGames() {
		String teste = "";
		if(videoGames.isEmpty()) {
			teste += "A loja nao tem videogames no seu estoque.";
		} else {			
			for(VideoGame videoGame : videoGames) {
				teste += "Modelo: " + videoGame.modelo 
					  + ", preco: " + videoGame.preco 
					  + ", quantidade: " + videoGame.qtd 
					  + " em estoque.\n";
			}
		}
		return teste;
	}
	
	public Double calculaPatrimonio() {
		Double valorLivros = 0.0;
		Double valorVideogames = 0.0;
		Double patrimonio = 0.0;
		
		for(Livro livro : livros) {
			valorLivros = valorLivros + (livro.preco * livro.qtd);
		}
		
		for(VideoGame videoGame : videoGames) {
			valorVideogames = valorVideogames + (videoGame.preco * videoGame.qtd);
		}
		
		patrimonio = valorLivros + valorVideogames;
		
		return patrimonio;
	}
}