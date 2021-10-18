package decomportamiento.state02.src;

public class Promo implements State {
	ExpendedoraCaranelos expendedoraCaranelos;

	public Promo(ExpendedoraCaranelos expendedoraCaranelos) {
		this.expendedoraCaranelos = expendedoraCaranelos;
	}

	public void insertarMoneda() {
		System.out.println("Por favor espere, le estamos entregando su caramelo");
	}

	public void sacarMoneda() {
		System.out.println("Por favor espere, le estamos entregando su caramelo");
	}

	public void presionarBoton() {
		System.out.println("Presionar nuevamente, no le dara otro caramelo");
	}

	public void dispachar() {
		System.out.println("Se Ha ganado una promo 2X1, dos caramelos por una moneda");
		expendedoraCaranelos.releaseBall();
		if (expendedoraCaranelos.getCant() == 0) {
			expendedoraCaranelos.setState(expendedoraCaranelos.getAgotado());
		} else {
			expendedoraCaranelos.releaseBall();
			if (expendedoraCaranelos.getCant() > 0) {
				expendedoraCaranelos.setState(expendedoraCaranelos.getNoIngresoMoneda());
			} else {
				System.out.println(" No hay mas caramelos!");
				expendedoraCaranelos.setState(expendedoraCaranelos.getAgotado());
			}
		}
	}

	public String toString() {
		return " despachando dos caramelos por su moneda, Porque se ha ganado una PROMO 2 X 1!";
	}
}
