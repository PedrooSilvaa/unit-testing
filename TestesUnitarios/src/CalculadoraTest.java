
public class CalculadoraTest {

		
		Calculadora calculadora;

		public boolean testeSomaDaCalculadora(){
			calculadora = new Calculadora(6, 4);
			int resultadoEsperado = 10;
			int resultado = calculadora.soma();
			if(resultado == resultadoEsperado) {
				return true;
			}else {
				return false;
			}
		}

}
