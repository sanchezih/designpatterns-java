package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class Mirinda extends BebidaDeNaranja {

	public Mirinda() {
		setNombre("Mirinda");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
