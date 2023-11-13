package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class CocaColaFactory extends AbstractFactory {

	public BebidaDeColaAbstracta crearBebidaDeCola() {
		return new CocaCola();
	}

	public BebidaDeNaranjaAbstracta crearBebidaDeNaranja() {
		return new Fanta();
	}

}
