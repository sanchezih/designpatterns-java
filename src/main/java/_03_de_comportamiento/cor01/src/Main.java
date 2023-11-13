package _03_de_comportamiento.cor01.src;

public class Main {
	public static void main(String[] args) {
	
		IHandler gerente = new Empleado("Florencia (Gerente)", 1000, null);
		IHandler jefe = new Empleado("Martin (Jefe)", 500, gerente);
		IHandler empleado = new Empleado("Donato (Empleado)", 100, jefe);

		Request req = new Request(450);
		try {
			empleado.Handle(req);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
