package decreacion.singleton.src;

public class Main {

	public static void main(String[] args) {
		Singleton primerSingleton1 = Singleton.getInstance();
		primerSingleton1.setNombre("Juan");
		System.out.println("Nombre del singleton1 " + primerSingleton1.getNombre());
		Singleton primerSingleton2 = Singleton.getInstance();
		primerSingleton2.setNombre("Maria");

		System.out.println("Nombre del singleton2 " + primerSingleton2.getNombre());
		System.out.println("Nombre del singleton1 " + primerSingleton1.getNombre());

	}

}
