package decomportamiento.strategy01.src;

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
