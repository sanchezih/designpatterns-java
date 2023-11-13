package _03_de_comportamiento.state02.src;

public class ExpendedoraDeCaramelos {

	Estado agotado;
	Estado noIngresoMoneda;
	Estado ingresoMoneda;
	Estado vendido;
	Estado promo;

	Estado estado = agotado;
	int cant = 0;

	/**
	 * 
	 * @param nroCaramelos
	 */
	public ExpendedoraDeCaramelos(int nroCaramelos) {
		agotado = new Agotado(this);
		noIngresoMoneda = new NoIngresoMoneda(this);
		ingresoMoneda = new IngresoMoneda(this);
		vendido = new Vendido(this);
		promo = new Promo(this);

		this.cant = nroCaramelos;
		if (nroCaramelos > 0) {
			estado = noIngresoMoneda;
		}
	}

	/**
	 * 
	 */
	public void insertarMoneda() {
		estado.insertarMoneda();
	}

	public void sacarMoneda() {
		estado.sacarMoneda();
	}

	public void presionarBoton() {
		estado.presionarBoton();
		estado.dispachar();
	}

	void setState(Estado state) {
		this.estado = state;
	}

	/**
	 * 
	 */
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
		estado = noIngresoMoneda;
	}

	public Estado getState() {
		return estado;
	}

	public Estado getAgotado() {
		return agotado;
	}

	public Estado getNoIngresoMoneda() {
		return noIngresoMoneda;
	}

	public Estado getIngresoMoneda() {
		return ingresoMoneda;
	}

	public Estado getVendido() {
		return vendido;
	}

	public Estado getPromo() {
		return promo;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("\nInventario: " + cant + " caramelo");
		if (this.cant != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("La maquina esta " + estado + "\n");
		return result.toString();
	}
}
