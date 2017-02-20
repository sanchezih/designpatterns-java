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
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class EstrategiaTAB extends EstrategiaDeExportacion {

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.palermo.ds.strategy.EstrategiaDeExportacion#exportarDatos()
	 */
	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "\t" + persona.getEdad() + "\t" + persona.getDireccion();
		System.out.println(datosCSV);
	}

}
