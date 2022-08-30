package decomportamiento.strategy01.src;

/**
 * Estrategia concreta
 * 
 * @author ihsanch
 *
 */
public class EstrategiaCSV extends EstrategiaDeExportacion {

	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();
		System.out.println(datosCSV);
	}

}
