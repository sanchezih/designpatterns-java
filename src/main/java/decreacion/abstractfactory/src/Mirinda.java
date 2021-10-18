package decreacion.abstractfactory.src;

public class Mirinda extends BebidaDeNaranjaAbstracta {

	public Mirinda() {
		setNombre("Mirinda");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
