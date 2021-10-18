package estructurales.composite.src;

public class Main {

	public static void main(String[] args) {
		Producto macMenuBomba = new Combo();
		macMenuBomba.setNombre("Mac Menu Bomba");

		Producto hamburguesaHot = new ProductoConcreto();
		hamburguesaHot.setNombre("Hamburguesa con Salsa HOT");
		hamburguesaHot.setPrecio(10d);

		Producto fritasHot = new ProductoConcreto();
		fritasHot.setNombre("Fritas Hot");
		fritasHot.setPrecio(5d);

		Producto macMenuPostreLoco = new Combo();
		macMenuPostreLoco.setNombre("Mac Menu Postre Loco");

		Producto postreHot = new ProductoConcreto();
		postreHot.setNombre("Postre con hielo seco");
		postreHot.setPrecio(8d);
		macMenuPostreLoco.agregar(postreHot);

		macMenuBomba.agregar(hamburguesaHot);
		macMenuBomba.agregar(fritasHot);
		macMenuBomba.agregar(macMenuPostreLoco);

		macMenuBomba.mostrar();

	}
}
