package decomportamiento.cor01.src;

public class Main {
	public static void main(String[] args) {
		IHandler gerente = new Employee("Florencia (Gerente)", 1000, null);
		IHandler jefe = new Employee("Martin (Jefe)", 500, gerente);
		IHandler empleado = new Employee("Donato (Empleado)", 100, jefe);

		Request req = new Request(450);
		try {
			empleado.Handle(req);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
