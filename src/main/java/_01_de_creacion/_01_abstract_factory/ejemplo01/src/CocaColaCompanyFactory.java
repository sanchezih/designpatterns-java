package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class CocaColaCompanyFactory extends AbstractFactory {

	public BebidaDeCola crearBebidaDeCola() {
		return new CocaCola();
	}

	public BebidaDeNaranja crearBebidaDeNaranja() {
		return new Fanta();
	}

}
