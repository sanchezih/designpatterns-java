package _01_de_creacion.mvc02.src;

import _01_de_creacion.mvc02.src.controlador.Coordinador;
import _01_de_creacion.mvc02.src.modelo.Logica;
import _01_de_creacion.mvc02.src.vista.VentanaBuscar;
import _01_de_creacion.mvc02.src.vista.VentanaPrincipal;
import _01_de_creacion.mvc02.src.vista.VentanaRegistro;

public class Main {

	Logica miLogica;
	VentanaPrincipal miVentanaPrincipal;
	VentanaBuscar miVentanaBuscar;
	VentanaRegistro miVentanaRegistro;
	Coordinador miCoordinador;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Main miPrincipal = new Main();
		miPrincipal.iniciar();
	}

	/**
	 * Permite instanciar todas las clases con las que trabaja el sistema
	 */
	private void iniciar() {

		/* Se instancian las clases */
		miVentanaPrincipal = new VentanaPrincipal();
		miVentanaRegistro = new VentanaRegistro();
		miVentanaBuscar = new VentanaBuscar();
		miLogica = new Logica();
		miCoordinador = new Coordinador();

		/* Se establecen las relaciones entre clases */
		miVentanaPrincipal.setCoordinador(miCoordinador);
		miVentanaRegistro.setCoordinador(miCoordinador);
		miVentanaBuscar.setCoordinador(miCoordinador);
		miLogica.setCoordinador(miCoordinador);

		/* Se establecen relaciones con la clase coordinador */
		miCoordinador.setMiVentanaPrincipal(miVentanaPrincipal);
		miCoordinador.setMiVentanaRegistro(miVentanaRegistro);
		miCoordinador.setMiVentanaBuscar(miVentanaBuscar);
		miCoordinador.setMiLogica(miLogica);

		miVentanaPrincipal.setVisible(true);
	}

}
