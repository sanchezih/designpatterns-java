package estructurales.composite.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Combo extends Producto {

	private ArrayList productos = new ArrayList();

	public void agregar(Producto p) {
		productos.add(p);
	}

	public void quitar(Producto p) {
		productos.remove(p);
	}

	public void mostrar() {
		System.out.println(">Combo: " + getNombre());
		Iterator iterator = productos.iterator();
		while (iterator.hasNext()) {
			Producto element = (Producto) iterator.next();
			element.mostrar();
		}
		System.out.println("Total " + getNombre() + " :" + getPrecio());
	}

	public double getPrecio() {
		double total = 0;
		Iterator iterator = productos.iterator();
		while (iterator.hasNext()) {
			Producto element = (Producto) iterator.next();
			total += element.getPrecio();
		}
		return total;
	}

	public void setPrecio(double precio) {
		throw new UnsupportedOperationException("No es posible ejecutar esta operación en un combo");
	}

}
