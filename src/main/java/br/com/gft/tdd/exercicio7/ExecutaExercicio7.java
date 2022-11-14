package br.com.gft.tdd.exercicio7;

public class ExecutaExercicio7 {

	public void getExercicio7() {
		
		System.out.println("--------------- Exercicio 7 ---------------");
		
		Gerente gerente = new Gerente("Fulano", 47, 12000.00);
		Supervisor supervisor = new Supervisor("Ciclano", 32, 4500.00);
		Vendedor vendedor = new Vendedor("Beltrano", 23, 2300.00);
		
		System.out.println(gerente);
		System.out.println(supervisor);
		System.out.println(vendedor);
	}
}