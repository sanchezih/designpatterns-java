package _03_de_comportamiento.templatemethod01.src;

public class CafeteriaTest {
	public static void main(String[] args) {

		Te te = new Te();
		Cafe cafe = new Cafe();

		System.out.println("\nHacer un te...");

		te.preparar();

		System.out.println("\nHacer un cafe...");
		cafe.preparar();

	}
}
