/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */


import java.util.HashMap;

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class ExportadorDeDatosPersonales {

	private EstrategiaDeExportacion estrategia = null;
	private Persona persona = null;
	private HashMap estrategias = new HashMap();

	public ExportadorDeDatosPersonales() {
		estrategias.put(EstrategiaDeExportacion.ESTRATEGIA_XML, new EstrategiaXML());
		estrategias.put(EstrategiaDeExportacion.ESTRATEGIA_CSV, new EstrategiaCSV());
		estrategias.put(EstrategiaDeExportacion.ESTRATEGIA_TAB, new EstrategiaTAB());
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public void exportaDatosDeLaPersona() {

		estrategia.setPersona(persona);
		estrategia.exportarDatos();
	}

	public void cambiarEstrategia(String estrategiaString) {
		estrategia = (EstrategiaDeExportacion) estrategias.get(estrategiaString);
	}
}
