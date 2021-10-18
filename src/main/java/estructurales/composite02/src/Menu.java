package estructurales.composite02.src;

import java.util.Iterator;
import java.util.ArrayList;

public class Menu extends ComponenteMenu {
	ArrayList componentes = new ArrayList();

	String descripcion;

	public Menu(String descripcion) {

		this.descripcion = descripcion;
	}

	public void add(ComponenteMenu componente) {
		componentes.add(componente);
	}

	public void remove(ComponenteMenu componente) {
		componentes.remove(componente);
	}

	public ComponenteMenu getChild(int i) {
		return (ComponenteMenu) componentes.get(i);
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void print() {

		System.out.println(getDescripcion());
		System.out.println("---------------------");

		Iterator iterator = componentes.iterator();
		while (iterator.hasNext()) {
			ComponenteMenu componente = (ComponenteMenu) iterator.next();
			componente.print();
		}
	}
}
