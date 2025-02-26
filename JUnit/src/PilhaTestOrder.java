import static org.junit.jupiter.api.Assertions.*;

import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING) // pelo nome
class PilhaTestOrder {

	@Test
	public void PrimeirotesteInserindoUmLivro() {
		Pilha pilha = new Pilha();
		pilha.inserindoLivroNaPilha(new Livro("A História"));
		
		String resultadoEsperado = "A História";
		Livro livro = pilha.lendoUltimoLivroDaPilha();
		
		System.out.println("testeInserindoUmLivro");
		
		assertEquals(resultadoEsperado, livro.getTitulo());
	}
	
	@Test
	public void SegundotesteInserindoUmLivro() {
		Pilha pilha = new Pilha();
		pilha.inserindoLivroNaPilha(new Livro("A História"));
		
		String resultadoEsperado = "A História";
		Livro livro = pilha.lendoUltimoLivroDaPilha();
		
		System.out.println("testeInserindoUmLivro");
		
		assertEquals(resultadoEsperado, livro.getTitulo());
	}
	
	@Test
	public void TerceirotesteInserindoUmLivro() {
		Pilha pilha = new Pilha();
		pilha.inserindoLivroNaPilha(new Livro("A História"));
		
		String resultadoEsperado = "A História";
		Livro livro = pilha.lendoUltimoLivroDaPilha();
		
		System.out.println("testeInserindoUmLivro");
		
		assertEquals(resultadoEsperado, livro.getTitulo());
	}

}
