package br.com.gft.tdd.exercicio2.model;

public class VideoGame extends Produto  {
	
	protected String marca;
	protected String modelo;
	protected boolean isUsado;
	
	public VideoGame(String nome, Double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setIsUsado(isUsado);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean getIsUsado() {
		return isUsado;
	}

	public void setIsUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}
	
	@Override
	public String toString() {
		String texto = super.toString();
		texto += "\nNome: " + this.getNome() + 
				 "\nPreco: " + this.getPreco() + 
				 "\nQuantidade: " + this.getQtd() + 
				 "\nMarca: " + this.getMarca() + 
				 "\nModelo: " + this.getModelo() + 
				 "\nUsado: " + this.getIsUsado() + "\n";
		return texto;
	}

	@Override
	public void calculaImposto() {
		if(this.isUsado == true) {
			Double imposto = (this.preco * 25) / 100;
			
			System.out.println("Imposto " + this.nome + " " + this.modelo + " usado, R$" + imposto + ".");
			System.out.println("-----------------------------------------------------------------");
		} else {
			Double imposto = (this.preco * 45) / 100;
			
			System.out.println("Imposto " + this.nome + " " + this.modelo + " R$" + imposto + ".");
			System.out.println("-----------------------------------------------------------------");
		}
	}
}