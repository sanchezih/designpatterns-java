package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class Pepsi extends BebidaDeCola {

	public Pepsi() {
		setNombre("Pepsi");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
