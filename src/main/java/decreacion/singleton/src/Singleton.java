package decreacion.singleton.src;

import java.util.Date;

public class Singleton {
	private static Singleton singleton = null;
	private String nombre;

	private Singleton() {
		System.out.println("Creando un singleton " + new Date());
	}

	public static Singleton getInstance() {
		if (singleton == null) {
			System.out.println("Generando un nuevo singleton");
			singleton = new Singleton();
		} else {
			System.out.println("Retornando el mismo singleton");
		}
		return singleton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}