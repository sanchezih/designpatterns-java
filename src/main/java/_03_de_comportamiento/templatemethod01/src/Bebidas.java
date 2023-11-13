package _03_de_comportamiento.templatemethod01.src;

public abstract class Bebidas {

	final void preparar() {
		hervirAgua();
		agregarInfusion();
		ponerEnTaza();
		agregarCondimentos();
	}

	abstract void agregarInfusion();

	abstract void agregarCondimentos();

	void hervirAgua() {
		System.out.println("Hervir el agua");
	}

	void ponerEnTaza() {
		System.out.println("Verter en la taza");
	}
}
