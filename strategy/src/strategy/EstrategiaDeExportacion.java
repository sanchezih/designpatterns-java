/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
package strategy;

/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public abstract class EstrategiaDeExportacion {
	public static final String ESTRATEGIA_XML = "XML";
	public static final String ESTRATEGIA_CSV = "CSV";
	public static final String ESTRATEGIA_TAB = "TAB";
	
	private Persona persona;
	
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	public abstract void exportarDatos();
}
