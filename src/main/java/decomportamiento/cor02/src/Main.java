package decomportamiento.cor02.src;

public class Main {
	public static void main(String[] args) {
		Socio socio = new Socio();
		Gerente gerente = new Gerente(socio);
		Director director = new Director(gerente);

		director.manejarPedido(100);
		director.manejarPedido(6500);
		director.manejarPedido(475000);

	}
}
