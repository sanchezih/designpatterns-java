/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class EstrategiaXML extends EstrategiaDeExportacion {

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.palermo.ds.strategy.EstrategiaDeExportacion#exportarDatos()
	 */
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
