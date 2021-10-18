package decomportamiento.visitor.src;

public class Main {

	public static void main(String[] args) {
		Empleado juan = new Empleado("Juan", 1000, 2, 3);
		Empleado martin = new Empleado("Martin", 2300, 0, 10);
		Empleado lucas = new Empleado("Lucas", 1700, 2, 7);
		LiquidadorDeSueldos liquidadorDeSueldos = new LiquidadorDeSueldos();
		liquidadorDeSueldos.agregarEmpleado(juan);
		liquidadorDeSueldos.agregarEmpleado(martin);
		liquidadorDeSueldos.agregarEmpleado(lucas);
		liquidadorDeSueldos.liquidarSueldos();
	}
}
