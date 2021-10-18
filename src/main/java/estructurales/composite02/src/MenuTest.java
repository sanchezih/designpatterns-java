package estructurales.composite02.src;

public class MenuTest {
	public static void main(String args[]) {

		ComponenteMenu menues = new Menu("Carta del Bar");
		ComponenteMenu menuAlmuerzo = new Menu("Almuerzo");
		ComponenteMenu menuCena = new Menu("Cena");

		menues.add(menuAlmuerzo);
		menuAlmuerzo.add(new MenuItem("Asado", "parrillada completa para dos", false, 3.69));
		menuAlmuerzo.add(new MenuItem("Lomito", "lomito al plato con ensalada mixta", true, 4.29));

		menuCena.add(new MenuItem("Menu Vegetariano", "zapallo salteado", true, 2.99));

		menuCena.add(new MenuItem("Sopa del dia", "Sopa de Tomate y pollo", false, 3.29));

		menues.add(menuCena);

		Mozo waitress = new Mozo(menues);

		waitress.printMenu();
	}
}
