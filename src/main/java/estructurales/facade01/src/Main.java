package estructurales.facade01.src;

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
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
