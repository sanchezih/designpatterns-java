package decreacion.abstractfactory.src;
/*
 * Created on 13/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
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
