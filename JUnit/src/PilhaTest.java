import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaTest {


	@Test
	public void testeInserindoUmLivro() {
		Pilha pilha = new Pilha();
		pilha.inserindoLivroNaPilha(new Livro("A História"));
		
		String resultadoEsperado = "A História";
		Livro livro = pilha.lendoUltimoLivroDaPilha();
		
		assertEquals(resultadoEsperado, livro.getTitulo());
	}
 
}
