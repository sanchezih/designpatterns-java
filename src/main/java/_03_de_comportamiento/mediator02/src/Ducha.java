package _03_de_comportamiento.mediator02.src;

public class Ducha extends Colega {

	void activar() {
		System.out.println("La ducha esta lista ... ");
	}

	@Override
	void desactivar() {
		System.out.println("apagando ducha .. ");
	}

}
