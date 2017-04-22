
public class Main {


	public static void main(String[] args) {
		PrimerSingleton primerSingleton1 = PrimerSingleton.recuperarSingleton();
		primerSingleton1.setNombre("Juan");
		System.out.println("Nombre del singleton1 " + primerSingleton1.getNombre());
		PrimerSingleton primerSingleton2 = PrimerSingleton.recuperarSingleton();
		primerSingleton2.setNombre("Maria");

		System.out.println("Nombre del singleton2 " + primerSingleton2.getNombre());
		System.out.println("Nombre del singleton1 " + primerSingleton1.getNombre());

	}

}
