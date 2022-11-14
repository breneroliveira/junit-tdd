package br.com.gft.tdd.main;

import java.io.IOException;
import java.util.Scanner;

import br.com.gft.tdd.dojopuzzles.DesafioBonus;
import br.com.gft.tdd.dojopuzzles.ExecutaDesafioBonus;
import br.com.gft.tdd.exercicio1.ExecutaExercicio1;
import br.com.gft.tdd.exercicio2.executaexercicio2.ExecutaExercicio2;
import br.com.gft.tdd.exercicio3.ExecutaExercicio3;
import br.com.gft.tdd.exercicio7.ExecutaExercicio7;

public class Main {

	public static void main(String[] args) throws IOException {
		menu();
	}
	
	public static void menu() throws IOException {
		try {
			Scanner menu = new Scanner(System.in);
			do {
				limpaTela();
				
				System.out.println("*------------------------------------*");
				System.out.println("|           MENU DE OPCOES           |");
				System.out.println("*------------------------------------*");
				System.out.println("| 0 - Sair                           |");
				System.out.println("| 1 - Exercicio 1                    |");
				System.out.println("| 2 - Exercicio 2                    |");
				System.out.println("| 3 - Exercicio 3                    |");
				System.out.println("| 7 - Exercicio 7                    |");
				System.out.println("| 8 - Desafio bonus                  |");
				System.out.println("*------------------------------------*");
				System.out.print("Escolha uma opcao: ");
				
				int opcao = menu.nextInt();
				System.out.flush();
				
				switch(opcao) {
				case 0:
					limpaTela();
					System.out.println("\nPrograma finalizado.");
					pauseEnter();
					limpaTela();
					System.exit(0);
				case 1:
					limpaTela();
					ExecutaExercicio1 exercicio1 = new ExecutaExercicio1();
					exercicio1.getExercicio1();
					pauseEnter();
					break;
				case 2:
					limpaTela();
					ExecutaExercicio2 exercicio2 = new ExecutaExercicio2();
					exercicio2.getExercicio2();
					pauseEnter();
					break;
				case 3:
					limpaTela();
					ExecutaExercicio3 exercicio3 = new ExecutaExercicio3();
					exercicio3.getExercicio3();
					pauseEnter();
					break;
				case 7:
					limpaTela();
					ExecutaExercicio7 exercicio7 = new ExecutaExercicio7();
					exercicio7.getExercicio7();
					pauseEnter();
					break;
				case 8:
					limpaTela();
					ExecutaDesafioBonus desafioBonus = new ExecutaDesafioBonus();
					desafioBonus.getDesafioBonus();
					pauseEnter();
					break;
				default:
					limpaTela();
					System.out.println("\nOpcao invalida.");
					pauseEnter();
					break;
				}
			} while(true);
		} catch(Exception e) {
			limpaTela();
			System.out.println("\nErro: " + e.getMessage() +
                     "\nClasse do Erro: " + e.getClass() + "\n"
                     + "O menu aceita apenas numeros inteiros, tente novamente.");
			pauseEnter();
			menu();
		}
	}
	
	public static void pauseEnter() throws IOException {
		System.out.println("\nPressione Enter para continuar...");
		System.in.read();
	}
	
	public static void limpaTela() {
		for(int clear = 0; clear < 1000; clear++) {
		    System.out.println("\n") ;
		}
	}
}