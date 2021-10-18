package estructurales.composite.src;

public class ProductoConcreto extends Producto {

	public void agregar(Producto p) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operación en un producto concreto");
	}

	public void quitar(Producto p) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operación en un producto concreto");
	}

	public void mostrar() {
		System.out.println("Nombre: " + getNombre() + " Precio: " + getPrecio());
	}

}
