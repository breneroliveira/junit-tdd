package br.com.gft.tdd.exercicio7;

public class Vendedor extends Funcionario {

	public Vendedor(String nome, int idade, Double salario) {
		super(nome, idade, salario);
	}
	
	@Override
	public Double bonificacao(Double salario) {
		return (salario + 3000.00);
	}
	
	public String toString() {
		String texto = "";
		texto += "\nNome: " + this.getNome() + 
				 "\nIdade: " + this.getIdade() + 
				 "\nSalario: " + this.getSalario() + 
				 "\nBonificacao: " + this.bonificacao(getSalario());
		return texto;
	}
}