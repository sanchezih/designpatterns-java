package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class PepsiCoFactory extends AbstractFactory {

	public BebidaDeColaAbstracta crearBebidaDeCola() {
		return new Pepsi();
	}

	public BebidaDeNaranjaAbstracta crearBebidaDeNaranja() {
		return new Mirinda();
	}

}
