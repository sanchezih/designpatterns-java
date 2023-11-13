package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class Main {

	public static void main(String[] args) {
		
		ProductorasDeBedidasFactory mainFactory = new ProductorasDeBedidasFactory();
		BebidaDeCola bebidaDeCola = null;
		BebidaDeNaranja bebidaDeNaranja = null;
		AbstractFactory factory = null;

		factory = mainFactory.crearCocaColaFactory();
		bebidaDeCola = factory.crearBebidaDeCola();
		bebidaDeCola.preparar();

		bebidaDeNaranja = factory.crearBebidaDeNaranja();
		bebidaDeNaranja.preparar();

		factory = mainFactory.creaPepsiColaFactory();
		bebidaDeCola = factory.crearBebidaDeCola();
		bebidaDeCola.preparar();

		bebidaDeNaranja = factory.crearBebidaDeNaranja();
		bebidaDeNaranja.preparar();

	}

}
