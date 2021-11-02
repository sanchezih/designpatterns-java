package decomportamiento.strategy01.src;

public class EstrategiaTAB extends EstrategiaDeExportacion {

	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "\t" + persona.getEdad() + "\t" + persona.getDireccion();
		System.out.println(datosCSV);
	}

}
