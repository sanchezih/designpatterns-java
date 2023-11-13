package _03_de_comportamiento.state02.src;

public class Vendido implements Estado {
	ExpendedoraDeCaramelos expendedoraCaranelos;

	public Vendido(ExpendedoraDeCaramelos expendedoraCaranelos) {
		this.expendedoraCaranelos = expendedoraCaranelos;
	}

	public void insertarMoneda() {
		System.out.println("Por favor espere, ya le entregaremos su caramelo");
	}

	public void sacarMoneda() {
		System.out.println("Usted ya ha presionado");
	}

	public void presionarBoton() {
		System.out.println("Presionar dos veces no le va a dar otro caramelo");
	}

	public void dispachar() {
		expendedoraCaranelos.releaseBall();
		if (expendedoraCaranelos.getCant() > 0) {
			expendedoraCaranelos.setState(expendedoraCaranelos.getNoIngresoMoneda());
		} else {
			System.out.println(" No hay mas caramelos!");
			expendedoraCaranelos.setState(expendedoraCaranelos.getAgotado());
		}
	}

	public String toString() {
		return "dispensing a gumball";
	}
}
