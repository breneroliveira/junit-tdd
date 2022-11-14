package br.com.gft.tdd.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class ExecutaExercicio3 {

	public void getExercicio3() {
		
		System.out.println("--------------- Exercicio 3 ---------------");
		
		List<String> magia = new ArrayList<String>();
		magia.add("Fire Ball");
		magia.add("Heal");
		
		List<String> habilidade = new ArrayList<String>();
		habilidade.add("Hyper Punch");
		habilidade.add("Body Slam");
		
		Mago mago = new Mago("Timitrion Wys", 10, 15, 500f, 18, 5, 7, magia);
		System.out.println(mago);
		
		Guerreiro guerreiro = new Guerreiro("Aslaois Carummin", 19, 2, 500f, 10, 18, 8, habilidade);
		System.out.println(guerreiro);
		
		mago.lvlUp();
		System.out.println(mago);
		
		guerreiro.lvlUp();
		System.out.println(guerreiro);
		
		System.out.println("\nDano de ataque do mago " + mago.getNome() + ": " + mago.attack());
		System.out.println("\nDano de ataque do guerreiro " + guerreiro.getNome() + ": " + guerreiro.attack());
		
		Personagem personagem = new Personagem("Joao", 1, 1, 0f, 0, 0, 0);
		System.out.println("\nQuantidade de personagens: " + personagem.proximoPersonagem());

		mago.aprenderMagia("Hyper Beam");
		System.out.println(mago);
		
		guerreiro.aprenderHabilidade("Arm Thrust");
		System.out.println(guerreiro);
	}
}