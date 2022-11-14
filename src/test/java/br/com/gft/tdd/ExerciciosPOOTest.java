package br.com.gft.tdd;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.gft.tdd.exercicio1.Veiculo;
import br.com.gft.tdd.exercicio2.model.Livro;
import br.com.gft.tdd.exercicio2.model.Loja;
import br.com.gft.tdd.exercicio2.model.VideoGame;
import br.com.gft.tdd.exercicio3.Guerreiro;
import br.com.gft.tdd.exercicio3.Mago;
import br.com.gft.tdd.exercicio7.Gerente;
import br.com.gft.tdd.exercicio7.Supervisor;
import br.com.gft.tdd.exercicio7.Vendedor;

public class ExerciciosPOOTest {
	
	private Veiculo carro;
	
	private Livro l1;
	private Livro l2;
	private Livro l3;
	private VideoGame ps4;
	private VideoGame ps4Usado;
	private VideoGame xbox;
	private List<Livro> livros;
	private List<VideoGame> games;
	private Loja americanas;
	
	private List<String> magia;
	private List<String> habilidade;
	private Mago mago;
	private Guerreiro guerreiro;
	
	private Gerente gerente;
	private Supervisor supervisor;
	private Vendedor vendedor;
	
	@BeforeEach
	public void setup() {
		carro = new Veiculo("Chevrolet", "Corsa", "MXK7059", "Preto", 3000.00f, true, 40, 1, 30000.00);
		
		l1 = new Livro("Harry Potter", 40.00, 50, "J. K. Rowling", "fantasia", 300);
		l2 = new Livro("Senhor dos Aneis", 60.00, 30, "J. R. R. Tolkien", "fantasia", 500);
		l3 = new Livro("Java POO", 20.00, 50, "GFT", "educativo", 500);
		ps4 = new VideoGame("PS4", 1800.00, 100, "Sony", "Slim", false);
		ps4Usado = new VideoGame("PS4", 1000.00, 7, "Sony", "Slim", true);
		xbox = new VideoGame("XBOX", 1500.00, 500, "Microsoft", "One", false);
		livros = new ArrayList<>();
		games = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		games.add(ps4);
		games.add(ps4Usado);
		games.add(xbox);
		americanas = new Loja("Americanas", "12345678", livros, games);
		
		magia = new ArrayList<String>();
		magia.add("Fire Ball");
		magia.add("Heal");
		habilidade = new ArrayList<String>();
		habilidade.add("Hyper Punch");
		habilidade.add("Body Slam");
		mago = new Mago("Timitrion Wys", 10, 15, 500f, 18, 5, 7, magia);
		guerreiro = new Guerreiro("Aslaois Carummin", 19, 2, 500f, 10, 18, 8, habilidade);
		
		gerente = new Gerente("Fulano", 47, 12000.00);
		supervisor = new Supervisor("Ciclano", 32, 4500.00);
		vendedor = new Vendedor("Beltrano", 23, 2300.00);
	}

	@Test
	public void deveAcrescentar20NaVelocidadeDoVeiculo() throws Exception {
		carro.acelerar();
		
		assertEquals(21, carro.getVelocidade());
	}
	
	@Test
	public void deveReceberQuantidadeDeCombustivel() throws Exception {
		carro.abastecer(20);
		
		assertEquals(60, carro.getLitrosCombustivel());
	}
	
	@Test
	public void deveSubtrair20DaVelocidadeDoVeiculo() throws Exception {
		carro.frear();
		
		assertEquals(0, carro.getVelocidade());
	}
	
	@Test
	public void deveAlterarACorDoVeiculo() throws Exception {
		carro.pintar("Vermelho");
		
		assertEquals("Vermelho", carro.getCor());
	}
	
	@Test
	public void deveLigarOVeiculoCasoEstejaDesligado() throws Exception {
		assertEquals(true, carro.getIsLigado());
	}
	
	@Test
	public void deveDesligarOVeiculoCasoEstejaLigado() throws Exception {
		assertEquals(true, carro.getIsLigado());
	}
	
	@Test
	public void deveListarOsLivrosDaLoja() throws Exception {
		String listaLivros = 
				"Titulo: " + l1.getNome() + ", preco: " + l1.getPreco()
				+ ", quantidade: " + l1.getQtd() + " em estoque.\n" 
				+ "Titulo: " + l2.getNome() + ", preco: " + l2.getPreco() 
				+ ", quantidade: 30 em estoque.\n"
				+ "Titulo: " + l3.getNome() + ", preco: " + l3.getPreco() 
				+ ", quantidade: " + l3.getQtd() + " em estoque.\n";
		
		assertEquals(listaLivros, americanas.listaLivros());
	}
	
	@Test
	public void testName() throws Exception {
		List<String> listaLivros = new ArrayList<>();
		
		listaLivros.add("A loja Americanas possui estes livros para venda: \n");
	}
	
	@Test
	public void deveListarOsVideoGamesDaLoja() throws Exception {
		String listaVideoGames = 
				"Modelo: " + ps4.getModelo() + ", preco: " + ps4.getPreco()
				+ ", quantidade: " + ps4.getQtd() + " em estoque.\n" 
				+ "Modelo: " + ps4Usado.getModelo() + ", preco: " + ps4Usado.getPreco() 
				+ ", quantidade: " + ps4Usado.getQtd() + " em estoque.\n"
				+ "Modelo: " + xbox.getModelo() + ", preco: " + xbox.getPreco() 
				+ ", quantidade: " + xbox.getQtd() + " em estoque.\n";
		
		assertEquals(listaVideoGames, americanas.listaVideoGames());
	}
	
	@Test
	public void deveCalcularOPatrimonioDaLoja() throws Exception {
		assertEquals(941800.0, americanas.calculaPatrimonio(), 0.0001);
	}
	
	@Test
	public void deveSubirONivelDoMago() throws Exception {
		int mana = mago.getMana();
		int inteligencia = mago.getInteligencia();
		
		mago.lvlUp();
		
		assertEquals((mana + 4), mago.getMana());
		assertEquals((inteligencia + 4), mago.getInteligencia());
	}
	
	@Test
	public void deveSubirONivelDoGuerreiro() throws Exception {
		int vida = guerreiro.getVida();
		int forca = guerreiro.getForca();
		
		guerreiro.lvlUp();
		
		assertEquals((vida + 4), guerreiro.getVida());
		assertEquals((forca + 4), guerreiro.getForca());
	}
	
	@Test
	public void deveCalcularOValorDoAtaqueDoMago() throws Exception {
		int ataqueTotal = mago.attack();
		int valorRandomico = ataqueTotal - (mago.getInteligencia() * mago.getLevel());
		
		assertEquals(((mago.getInteligencia() * mago.getLevel()) + valorRandomico), ataqueTotal);
	}
	
	@Test
	public void deveCalcularOValorDoAtaqueDoGuerreiro() throws Exception {
		int ataqueTotal = guerreiro.attack();
		int valorRandomico = ataqueTotal - (guerreiro.getInteligencia() * guerreiro.getLevel());
		
		assertEquals(((guerreiro.getInteligencia() * guerreiro.getLevel()) + valorRandomico), ataqueTotal);
	}
	
	@Test
	public void deveAprenderUmaMagia() throws Exception {
		mago.aprenderMagia("Hyper Beam");
		
		assertEquals("Hyper Beam", mago.getMagia().get(mago.getMagia().size() - 1));
	}
	
	@Test
	public void deveAprenderUmaHabilidade() throws Exception {
		guerreiro.aprenderHabilidade("Arm Thrust");
		
		assertEquals("Arm Thrust", guerreiro.getHabilidade().get(guerreiro.getHabilidade().size() - 1));
	}
	
	@Test
	public void deveAdicionarABonficacaNoSalarioDoGerente() throws Exception {
		Double bonificacao = gerente.bonificacao(gerente.getSalario());
		
		assertEquals((gerente.getSalario() + 10000.00), bonificacao);
	}
	
	@Test
	public void deveAdicionarABonficacaNoSalarioDoSupervisor() throws Exception {
		Double bonificacao = supervisor.bonificacao(supervisor.getSalario());
		
		assertEquals((supervisor.getSalario() + 5000.00), bonificacao);
	}
	
	@Test
	public void deveAdicionarABonficacaNoSalarioDoVendedor() throws Exception {
		Double bonificacao = vendedor.bonificacao(vendedor.getSalario());
		
		assertEquals((vendedor.getSalario() + 3000.00), bonificacao);
	}
}