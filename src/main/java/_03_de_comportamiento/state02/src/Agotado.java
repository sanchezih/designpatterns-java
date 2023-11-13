package _03_de_comportamiento.state02.src;

public class Agotado implements Estado {
	ExpendedoraDeCaramelos expendedoraCaranelos;

	public Agotado(ExpendedoraDeCaramelos expendedoraCaranelos) {
		this.expendedoraCaranelos = expendedoraCaranelos;
	}

	public void insertarMoneda() {
		System.out.println("No puede insertar una moneda, los caramelos estan agotados");
	}

	public void sacarMoneda() {
		System.out.println(" No se puede devolver, no ingreso una moneda");
	}

	public void presionarBoton() {
		System.out.println("Has presionado, pero no hay caramelos");
	}

	public void dispachar() {
		System.out.println("No se han entregado caramelos");
	}

	public String toString() {
		return "agotado";
	}
}
