package decomportamiento.mediator03.src;

import java.util.ArrayList;

public class Mediador implements IMediador {
	private ArrayList<Colega> colegas;

	// -------------------------------

	public Mediador() {
		this.colegas = new ArrayList<Colega>();
	}

	// -------------------------------

	public void agregarColega(Colega colega) {
		this.colegas.add(colega);
	}

	// ------------------------------

	@Override
	public void enviar(String mensaje, Colega originator) {
		for (Colega colega : colegas) {
			if (colega != originator) {
				colega.recibir(mensaje);
			}
		}
	}
}