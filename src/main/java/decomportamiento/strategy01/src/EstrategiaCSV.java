package decomportamiento.strategy01.src;

public class EstrategiaCSV extends EstrategiaDeExportacion {

	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();
		System.out.println(datosCSV);
	}

}
