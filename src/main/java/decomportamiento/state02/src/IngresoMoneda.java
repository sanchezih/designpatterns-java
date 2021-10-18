package decomportamiento.state02.src;

import java.util.Random;

public class IngresoMoneda implements State {
	Random randomPromo = new Random(System.currentTimeMillis());
	ExpendedoraCaranelos expendedoraCaramelos;

	public IngresoMoneda(ExpendedoraCaranelos expendedoraCaramelo) {
		this.expendedoraCaramelos = expendedoraCaramelo;
	}

	public void insertarMoneda() {
		System.out.println("No puede ingresar otra moneda");
	}

	public void sacarMoneda() {
		System.out.println("Moneda devuelta");
		expendedoraCaramelos.setState(expendedoraCaramelos.getNoIngresoMoneda());
	}

	public void presionarBoton() {
		System.out.println("Ha presionado el boton...");
		int winner = randomPromo.nextInt(10);
		if ((winner == 0) && (expendedoraCaramelos.getCant() > 1)) {
			expendedoraCaramelos.setState(expendedoraCaramelos.getPromo());
		} else {
			expendedoraCaramelos.setState(expendedoraCaramelos.getVendido());
		}
	}

	public void dispachar() {
		System.out.println("No se despacharon caramelos");
	}

	public String toString() {
		return "esperando que presione el boton";
	}
}
