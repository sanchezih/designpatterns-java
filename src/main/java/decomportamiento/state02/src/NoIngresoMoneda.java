package decomportamiento.state02.src;

public class NoIngresoMoneda implements State {
	ExpendedoraCaranelos expendedoraCaranelos;

	public NoIngresoMoneda(ExpendedoraCaranelos expendedoraCaranelos) {
		this.expendedoraCaranelos = expendedoraCaranelos;
	}

	public void insertarMoneda() {
		System.out.println("Ingresaste una moneda");
		expendedoraCaranelos.setState(expendedoraCaranelos.getIngresoMoneda());
	}

	public void sacarMoneda() {
		System.out.println("Todavia no has ingresado una moneda");
	}

	public void presionarBoton() {
		System.out.println("Has presionado, pero no ingresaste una moneda");
	}

	public void dispachar() {
		System.out.println("Necesitas pagar primero");
	}

	public String toString() {
		return "esperando por una moneda";
	}
}
