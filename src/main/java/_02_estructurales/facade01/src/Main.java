package _02_estructurales.facade01.src;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		Concesionaria concesionaria = new Concesionaria();
		Auto auto = new Auto();
		if (concesionaria.verificarVentaDirectaDeAuto(auto, cliente)) {
			System.out.println("El auto se puede vender directamente.");
		}

	}
}
