package _02_estructurales._03_composite.ejemplo02.src;

public class MenuItem extends ComponenteMenu {
	String nombre;
	String descripcion;
	boolean vegetariano;
	double precio;

	public MenuItem(String nombre, String descripcion, boolean vegetariano, double precio) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.vegetariano = vegetariano;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public boolean esVegetariano() {
		return vegetariano;
	}

	public void print() {
		System.out.print("  " + getNombre());
		if (esVegetariano()) {
			System.out.print("(v)");
		}
		System.out.println(", " + getPrecio());
		System.out.println("     -- " + getDescripcion());
	}

}
