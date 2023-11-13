package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class Fanta extends BebidaDeNaranjaAbstracta {

	public Fanta() {
		setNombre("Fanta");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}
}
