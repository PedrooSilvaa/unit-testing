import java.util.ArrayList;

public class Pilha {

	ArrayList<Livro> pilha = new ArrayList<Livro>();
	
	public void inserindoLivroNaPilha(Livro livro) {
		pilha.add(livro);
	}
	
	public Livro lendoUltimoLivroDaPilha() {
		return pilha.get(pilha.size() - 1);	
	}
	
	public Livro removendoUltimoLivroDaPilha() {
		Livro livro = pilha.get(pilha.size() - 1);	
		pilha.remove(pilha.size()-1);
		return livro;
	}
	
	public int contagemDeLivros() {
		return pilha.size();
	}
	
	public void inserindoLivroNaPilhaComException(Livro livro) {
		
		if(livro.getTitulo().startsWith("A")) {
			pilha.add(livro);
		}else {
			throw new RuntimeException("Não começa com letra 'A'");
		}
		
	}
	
}
