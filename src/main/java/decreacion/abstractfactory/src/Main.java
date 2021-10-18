package decreacion.abstractfactory.src;

public class Main {

	public static void main(String[] args) {
		ProductorasDeBedidasFactory mainFactory = new ProductorasDeBedidasFactory();
		BebidaDeColaAbstracta bebidaDeCola = null;
		BebidaDeNaranjaAbstracta bebidaDeNaranja = null;
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
