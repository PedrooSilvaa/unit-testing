import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTestFixtures {

	private static Pilha pilha;
	
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {
		pilha = new Pilha();
		System.out.println("setUpBeforeClass");
	}

	@AfterAll
	public static void tearDownAfterClass() throws Exception {
		pilha = null;
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
	public void setUp() throws Exception {
		Livro livro1 = new Livro("A Novela");
		Livro livro2 = new Livro("A Festa");
		Livro livro3 = new Livro("A Escola");
		Livro livro4 = new Livro("A Galeria");
		Livro livro5 = new Livro("A Historia");
		
		pilha.inserindoLivroNaPilha(livro1);
		pilha.inserindoLivroNaPilha(livro2);
		pilha.inserindoLivroNaPilha(livro3);
		pilha.inserindoLivroNaPilha(livro4);
		pilha.inserindoLivroNaPilha(livro5);
		
		System.out.println("setUp");
	}

	@AfterEach
	public void tearDown() throws Exception {
		int tamanho = pilha.contagemDeLivros();
		
		while(tamanho > 0 ) {
			pilha.removendoUltimoLivroDaPilha();
			tamanho--;
		}
		
		System.out.println("tearDown");
	}

	@Test
	public void testeInserindoUmLivro() {
		Pilha pilha = new Pilha();
		pilha.inserindoLivroNaPilha(new Livro("A História"));
		
		String resultadoEsperado = "A História";
		Livro livro = pilha.lendoUltimoLivroDaPilha();
		
		System.out.println("testeInserindoUmLivro");
		
		assertEquals(resultadoEsperado, livro.getTitulo());
	}

}
