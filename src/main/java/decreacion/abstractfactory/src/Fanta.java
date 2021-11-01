package decreacion.abstractfactory.src;

public class Fanta extends BebidaDeNaranjaAbstracta {

	public Fanta() {
		setNombre("Fanta");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
