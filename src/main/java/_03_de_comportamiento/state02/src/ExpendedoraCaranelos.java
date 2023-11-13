package _03_de_comportamiento.state02.src;

public class ExpendedoraCaranelos {

	State agotado;
	State noIngresoMoneda;
	State ingresoMoneda;
	State vendido;
	State promo;

	State state = agotado;
	int cant = 0;

	public ExpendedoraCaranelos(int nroCaramelos) {

		agotado = new Agotado(this);
		noIngresoMoneda = new NoIngresoMoneda(this);
		ingresoMoneda = new IngresoMoneda(this);
		vendido = new Vendido(this);
		promo = new Promo(this);

		this.cant = nroCaramelos;
		if (nroCaramelos > 0) {
			state = noIngresoMoneda;
		}
	}

	public void insertarMoneda() {
		state.insertarMoneda();
	}

	public void sacarMoneda() {
		state.sacarMoneda();
	}

	public void presionarBoton() {
		state.presionarBoton();
		state.dispachar();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("... el caramelo viene cayendo...");
		if (this.cant != 0) {
			this.cant = this.cant - 1;
		}
	}

	int getCant() {
		return this.cant;
	}

	void recarga(int cant) {
		this.cant = cant;
		state = noIngresoMoneda;
	}

	public State getState() {
		return state;
	}

	public State getAgotado() {
		return agotado;
	}

	public State getNoIngresoMoneda() {
		return noIngresoMoneda;
	}

	public State getIngresoMoneda() {
		return ingresoMoneda;
	}

	public State getVendido() {
		return vendido;
	}

	public State getPromo() {
		return promo;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("\nInventario: " + cant + " caramelo");
		if (this.cant != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("La maquina esta " + state + "\n");
		return result.toString();
	}
}
