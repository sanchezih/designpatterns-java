package _03_de_comportamiento.mediator02.src;

import java.util.Random;

public class Mediator {

	Colega alarma = new Alarma();
	Colega ventana = new Ventana();
	Colega cafetera = new Cafetera();
	Colega ducha = new Ducha();
	Colega calendario = new Calendario();

	void disparaCasaInteligente() {

		Random rand = new Random();
		boolean diaDeSemana = rand.nextBoolean();

		if (diaDeSemana) {
			// dia de semana
			calendario.activar();
			alarma.activar();
			ventana.activar();
			ducha.activar();
			cafetera.activar();
		}

		if (!diaDeSemana) {
			// fin de semana
			calendario.desactivar();
			alarma.desactivar();
			ventana.desactivar();
		}

	}

}
