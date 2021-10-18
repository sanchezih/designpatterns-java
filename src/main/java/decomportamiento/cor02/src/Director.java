package decomportamiento.cor02.src;

public class Director extends Aprobador {

	public Director(Aprobador sucesor) {
		super(sucesor);
	}

	public void manejarPedido(double monto) {
		if (monto >= 0 && monto < 5000) {
			System.out.println("Soy Director y puedo manejar los montos de entre 0 y 5000");
		} else {
			getSucesor().manejarPedido(monto);
		}
	}
}
