package _03_de_comportamiento.observer.src;

import java.util.Date;
import java.util.Observable;

public class Profesor extends Observable {
	private String nombre;

	public Profesor() {

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String string) {
		nombre = string;
	}

	public void nuevoExamen(String nombre, Date fecha) {
		Examen examen = new Examen();
		examen.setFecha(fecha);
		examen.setMateria(nombre);
		this.setChanged();
		this.notifyObservers(examen);
	}

}
