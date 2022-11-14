package br.com.gft.tdd.exercicio1;

public class ExecutaExercicio1 {

	public void getExercicio1() {
		
		System.out.println("--------------- Exercicio 1 ---------------");
		
		Veiculo carro = new Veiculo("Chevrolet", "Corsa", "MXK7059", "Preto", 3000.00f, true, 40, 0, 30000.00);
		System.out.println(carro);
		
		carro.acelerar();
		carro.abastecer(21);
		carro.frear();
		carro.pintar("Vermelho");
		carro.ligar();
		carro.desligar();
		
		System.out.println(carro);
	}
}