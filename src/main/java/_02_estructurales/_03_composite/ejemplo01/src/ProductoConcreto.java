package _02_estructurales._03_composite.ejemplo01.src;

public class ProductoConcreto extends Producto {

	public void agregarProducto(Producto p) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operacion en un producto concreto");
	}

	public void quitarProducto(Producto p) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operacion en un producto concreto");
	}

	public void mostrar() {
		System.out.println("Nombre: " + getNombre() + " Precio: " + getPrecio());
	}

}
