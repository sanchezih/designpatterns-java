package _03_de_comportamiento.strategy01.src;

/**
 * Estrategia concreta
 * 
 * @author ihsanch
 *
 */
public class EstrategiaTAB extends EstrategiaDeExportacion {

	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "\t" + persona.getEdad() + "\t" + persona.getDireccion();
		System.out.println(datosCSV);
	}

}
