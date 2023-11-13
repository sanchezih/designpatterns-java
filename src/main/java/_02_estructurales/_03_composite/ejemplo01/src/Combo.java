package _02_estructurales._03_composite.ejemplo01.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Combo extends Producto {

	private ArrayList<Producto> productos = new ArrayList<Producto>();

	/**
	 * 
	 */
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}

	/**
	 * 
	 */
	public void quitarProducto(Producto p) {
		productos.remove(p);
	}

	/**
	 * 
	 */
	public void mostrar() {
		System.out.println("-> Combo: " + getNombre());
		Iterator<Producto> iterator = productos.iterator();
		while (iterator.hasNext()) {
			Producto element = (Producto) iterator.next();
			element.mostrar();
		}
		System.out.println("Total " + getNombre() + " :" + getPrecio());
	}

	/**
	 * 
	 */
	public double getPrecio() {
		double total = 0;
		Iterator<Producto> iterator = productos.iterator();
		while (iterator.hasNext()) {
			Producto element = (Producto) iterator.next();
			total += element.getPrecio();
		}
		return total;
	}

	/**
	 * 
	 */
	public void setPrecio(double precio) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operacion en un combo");
	}

}
