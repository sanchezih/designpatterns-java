package decomportamiento.cor02.src;

public abstract class Aprobador {
	private Aprobador sucesor = null;

	public Aprobador(Aprobador sucesor) {
		this.sucesor = sucesor;
	}

	public Aprobador getSucesor() {
		return sucesor;
	}

	public abstract void manejarPedido(double monto);
}
