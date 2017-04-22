/*
 * Created on 13/08/2005
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
public class Main {

	public static void main(String[] args) {
		EstrategiaDeExportacion estrategia = null;
		Persona persona = new Persona("Juan Carlos",34, "Callaoz 56547");
		ExportadorDeDatosPersonales exportadorDeDatos = new ExportadorDeDatosPersonales();
		exportadorDeDatos.setPersona(persona);
		
		System.out.println("** XML **");
		exportadorDeDatos.cambiarEstrategia(EstrategiaDeExportacion.ESTRATEGIA_XML);
		exportadorDeDatos.exportaDatosDeLaPersona();
		System.out.println("\n");
		
		System.out.println("** CSV **");
		exportadorDeDatos.cambiarEstrategia(EstrategiaDeExportacion.ESTRATEGIA_CSV);
		exportadorDeDatos.exportaDatosDeLaPersona();
		System.out.println("\n");
		
		System.out.println("** TAB **");
		exportadorDeDatos.cambiarEstrategia(EstrategiaDeExportacion.ESTRATEGIA_TAB);
		exportadorDeDatos.exportaDatosDeLaPersona();
		System.out.println("\n");
		System.out.println("\n");
		
	}
}
