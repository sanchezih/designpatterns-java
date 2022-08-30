package decomportamiento.strategy01.src;

public class Main {

	public static void main(String[] args) {

		EstrategiaDeExportacion estrategia = null;
		Persona persona = new Persona("Juan Carlos", 34, "Callao 1147");
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
