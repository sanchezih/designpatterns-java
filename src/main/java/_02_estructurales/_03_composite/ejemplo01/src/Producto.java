package _02_estructurales._03_composite.ejemplo01.src;

public abstract class Producto {
	private String nombre;
	private double precio;

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public abstract void agregarProducto(Producto producto);

	public abstract void quitarProducto(Producto producto);

	public abstract void mostrar();

}
