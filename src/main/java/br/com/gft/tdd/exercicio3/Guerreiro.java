package br.com.gft.tdd.exercicio3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	
	protected List<String> habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
	List<String> habilidade) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.setHabilidade(habilidade);
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public String toString() {
		//String texto = super.toString();
		String texto = "";
		texto += "\nNome: " + this.getNome() + 
				 "\nVida: " + this.getVida() + 
				 "\nMana: " + this.getMana() + 
				 "\nXP: " + this.getXp() + 
				 "\nInteligencia: " + this.getInteligencia() + 
				 "\nForca: " + this.getForca() + 
				 "\nLevel: " + this.getLevel() + 
				 "\nHabilidade: " + this.getHabilidade()/* + "\n"*/;
		return texto;
	}
	
	@Override
	public void lvlUp() {
		this.vida += 4;
		this.mana += 2;
		this.xp += 250f;
		this.inteligencia += 2;
		this.forca += 4;
		this.level += 1;
	}
	
	public int attack() {
		
		Random random = new Random();
		int numeroRandomico = random.nextInt(300);
		
		int ataque = (this.forca * this.level) + numeroRandomico;
		
		return ataque;
	}
	
	public void aprenderHabilidade(String novaHabilidade) {
		
		habilidade.add(novaHabilidade);
	}
}