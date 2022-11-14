package br.com.gft.tdd.exercicio3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	
	protected List<String> magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
		List<String> magia) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
		this.setMagia(magia);
	}
	
	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	@Override
	public String toString() {
		String texto = "";
		texto += "\nNome: " + this.getNome() + 
				 "\nVida: " + this.getVida() + 
				 "\nMana: " + this.getMana() + 
				 "\nXP: " + this.getXp() + 
				 "\nInteligencia: " + this.getInteligencia() + 
				 "\nForca: " + this.getForca() + 
				 "\nLevel: " + this.getLevel() + 
				 "\nMagia: " + this.getMagia();
		return texto;
	}
	
	@Override
	public void lvlUp() {
		this.vida += 2;
		this.mana += 4;
		this.xp += 250f;
		this.inteligencia += 4;
		this.forca += 2;
		this.level += 1;
	}
	
	public int attack() {
		Random random = new Random();
		int numeroRandomico = random.nextInt(300);
		
		int ataque = (this.inteligencia * this.level) + numeroRandomico;
		
		return ataque;
	}
	
	public void aprenderMagia(String novaMagia) {
		magia.add(novaMagia);
	}
}