package decomportamiento.observer.src;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Estudiante estudiante1 = new Estudiante("Pepe");
		Estudiante estudiante2 = new Estudiante("Juan");
		Profesor profesor = new Profesor();
		profesor.addObserver(estudiante1);
		profesor.addObserver(estudiante2);
		profesor.nuevoExamen("Java 2", new Date());
	}
}
