import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PilhaTestException {

	Pilha pilha;
	
	@Test
	void testeInserirLivroException() {
		pilha = new Pilha();
		try {
			pilha.inserindoLivroNaPilhaComException(new Livro("O Pedro"));
		} catch (RuntimeException e) {
			assertTrue(true);
		}
		
	}

	

}
