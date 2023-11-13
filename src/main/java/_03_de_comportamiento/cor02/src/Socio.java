package _03_de_comportamiento.cor02.src;

public class Socio extends Aprobador {

	public Socio() {
		super(null);
	}

	public void manejarPedido(double monto) {
		System.out.println("Soy socio y puedo manejar los montos mas grandes: " + monto);
	}

}
