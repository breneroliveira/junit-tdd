package br.com.gft.tdd.dojopuzzles;

import java.util.Iterator;

public class ExecutaDesafioBonus {

	public void getDesafioBonus() {
		
		System.out.println("--------------- Desafio bonus - DojoPuzzles ---------------\n");
		
		DesafioBonus desafioBonus = new DesafioBonus();
		
		for(int i = 1; i <= 100; i++) {
			desafioBonus.adicionaNumeroNaLista(i);
		}
		
		Iterator<Integer> lista = desafioBonus.getLista1A100().iterator();
		
		while(lista.hasNext()) {
			int numero = lista.next();
			
			if(numero % 5 == 0 && numero % 3 == 0) {
				System.out.println("FizzBuzz");
			} else if(numero % 3 == 0) {
				System.out.println("Fizz");
			} else if(numero % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(numero);
			}
		}
		
		System.out.println("\nO enunciado do desafio bonus esta no diretorio "
				          + "src/assets");
	}
}