package _03_de_comportamiento.strategy01.src;

import java.util.HashMap;

/**
 * Clase de contexto
 * 
 * @author ihsanch
 *
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
