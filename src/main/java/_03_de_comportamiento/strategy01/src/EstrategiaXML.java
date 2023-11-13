package _03_de_comportamiento.strategy01.src;

/**
 * Estrategia concreta
 * 
 * @author ihsanch
 *
 */
public class EstrategiaXML extends EstrategiaDeExportacion {

	public void exportarDatos() {
		System.out.println(generarSalidaXML(getPersona()));
	}

	private String generarSalidaXML(Persona persona) {
		StringBuffer sb = new StringBuffer();
		sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n");
		sb.append("<Persona>\n");
		sb.append("   <nombre>" + persona.getNombre() + "</nombre>\n");
		sb.append("   <edad>" + persona.getEdad() + "</edad>\n");
		sb.append("   <direccion>" + persona.getDireccion() + "</direccion>\n");
		sb.append("</Persona>");
		return sb.toString();
	}

}
