package decomportamiento.visitor.src;

import java.util.ArrayList;
import java.util.Iterator;

public class LiquidadorDeSueldos implements IVisitador {
	private ArrayList empleados = new ArrayList();

	public void visitar(IElementoVisitado elemento) {
		Empleado empleado = (Empleado) elemento;
		double salario = empleado.getSalarioBase() + (empleado.getCantidadDeHijos() * 50)
				+ (empleado.getAntiguiedad() * 35);
		empleado.setSalario(salario);
	}

	public void liquidarSueldos() {
		Iterator listadoDeEmpleados = empleados.iterator();
		while (listadoDeEmpleados.hasNext()) {
			IElementoVisitado elemento = (IElementoVisitado) listadoDeEmpleados.next();
			elemento.aceptarVisita(this);
		}
		mostrarListado();
	}

	public ArrayList getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList empleados) {
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	private void mostrarListado() {
		Iterator listadoDeEmpleados = empleados.iterator();
		while (listadoDeEmpleados.hasNext()) {
			Empleado empleado = (Empleado) listadoDeEmpleados.next();
			System.out.println("Nombre:" + empleado.getNombre() + " Salario:" + empleado.getSalario());
		}
	}

}
