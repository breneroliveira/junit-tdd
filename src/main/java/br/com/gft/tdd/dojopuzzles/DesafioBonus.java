package br.com.gft.tdd.dojopuzzles;

import java.util.ArrayList;
import java.util.List;

public class DesafioBonus {
	
	private List<Integer> lista1A100 = new ArrayList<>();
	
	public List<Integer> getLista1A100() {
		return lista1A100;
	}

	public void setLista1A100(List<Integer> lista1a100) {
		lista1A100 = lista1a100;
	}
	
	public void adicionaNumeroNaLista(Integer numeroRecebido) {
		lista1A100.add(numeroRecebido);
	}
}