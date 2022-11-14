package br.com.gft.tdd.exercicio1;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, 
	int litrosCombustivel, int velocidade, Double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
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
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	
	public boolean getIsLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {		
		this.velocidade = this.velocidade + 20;
	}
	
	public void abastecer(int combustivel) {
		int verificaTanque = this.litrosCombustivel + combustivel;
		
		if(combustivel > 60 || verificaTanque > 60) {			
			System.out.println("\nO limite do tanque e de 60L.");
		} else if(combustivel < 60 || verificaTanque < 60) {
			this.litrosCombustivel = this.litrosCombustivel + combustivel;
		}
	}
	
	public void frear() {
		if(getVelocidade() == 0) {
			System.out.println("O veiculo esta parado.");
		} else {
			if(this.velocidade - 20 < 0) {
				this.velocidade = 0;
			} else if(this.velocidade - 20 > 0) {
				this.velocidade = this.velocidade - 20;
			}
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
	}
	
	public void ligar() {
		if(!isLigado) {
			isLigado = true;
		}
	}
	
	public void desligar() {
		if(getVelocidade() > 0) {
			System.out.println("O veiculo esta andando.");
		} else if(isLigado) {
			isLigado = false;
		}
	}
	
	public String toString() {
		String texto = "";
		texto += "\nMarca: " + this.getMarca() + 
				 "\nModelo: " + this.getPlaca() + 
				 "\nCor: " + this.getCor() + 
				 "\nKm: " + this.getKm() + 
				 "\nLigado: " + this.getIsLigado() + 
				 "\nLitros de combustivel: " + this.getLitrosCombustivel() + 
				 "\nVelocidade: " + this.getVelocidade() + 
				 "\nPreco: " + this.getPreco();
		return texto;
	}
}