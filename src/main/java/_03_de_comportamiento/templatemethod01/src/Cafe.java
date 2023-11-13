package _03_de_comportamiento.templatemethod01.src;

public class Cafe extends Bebidas {

	public void agregarInfusion() {
		System.out.println("Agregar cafe");
	}

	public void agregarCondimentos() {
		System.out.println("Agregar azucar y leche");
	}
}
