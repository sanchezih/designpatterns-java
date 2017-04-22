import java.util.Date;

public class PrimerSingleton {

	private static PrimerSingleton variableSingleton = null;
	private String nombre;

	private PrimerSingleton() {
		// System.out.println("Creando un singleton " + new Date());
	}

	public static PrimerSingleton recuperarSingleton() {
		if (variableSingleton == null) {
			System.out.println("Generando un nuevo singleton");
			variableSingleton = new PrimerSingleton();
			// System.out.println("Generando un nuevo singleton");
		} else {
			// System.out.println("Retornando el mismo singleton");
		}
		return variableSingleton;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
