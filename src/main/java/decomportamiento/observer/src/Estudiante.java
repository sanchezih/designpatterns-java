package decomportamiento.observer.src;

import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;

public class Estudiante implements Observer {

	private String nombre;

	public Estudiante(String nombre) {
		setNombre(nombre);
	}

	public void update(Observable observable, Object arg) {
		Examen examen = (Examen) arg;
		System.out.println("Estudiante: " + getNombre());

		System.out.println("Examen: " + examen.getMateria() + " Fecha: "
				+ SimpleDateFormat.getDateTimeInstance().format(examen.getFecha()) + "\n");

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String string) {
		nombre = string;
	}

}
