package decomportamiento.strategy.src;
/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */


/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class EstrategiaCSV extends EstrategiaDeExportacion {

	/* (non-Javadoc)
	 * @see edu.palermo.ds.strategy.EstrategiaDeExportacion#exportarDatos()
	 */
	public void exportarDatos() {
		Persona persona = getPersona();
		String datosCSV = persona.getNombre() + "," + persona.getEdad() + "," + persona.getDireccion();  
		System.out.println(datosCSV);
	}

}
