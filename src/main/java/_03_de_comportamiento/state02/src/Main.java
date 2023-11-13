package _03_de_comportamiento.state02.src;

public class Main {

	public static void main(String[] args) {
		ExpendedoraDeCaramelos expendedoraCaranelos = new ExpendedoraDeCaramelos(10);

		System.out.println(expendedoraCaranelos);

		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();
		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();

		System.out.println(expendedoraCaranelos);

		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();
		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();

		System.out.println(expendedoraCaranelos);

		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();
		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();

		System.out.println(expendedoraCaranelos);

		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();
		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();

		System.out.println(expendedoraCaranelos);

		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();
		expendedoraCaranelos.insertarMoneda();
		expendedoraCaranelos.presionarBoton();

		System.out.println(expendedoraCaranelos);
	}
}
