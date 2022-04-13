package decomportamiento.visitor.src;

import java.util.ArrayList;
import java.util.Iterator;

public class LiquidadorDeSueldos implements Visitador {
	
	private ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public void visitar(ElementoVisitado elemento) {
		Empleado empleado = (Empleado) elemento;
		double salario = empleado.getSalarioBase() + (empleado.getCantidadDeHijos() * 50)
				+ (empleado.getAntiguiedad() * 35);
		empleado.setSalario(salario);
	}

	public void liquidarSueldos() {
		Iterator<Empleado> listadoDeEmpleados = empleados.iterator();
		while (listadoDeEmpleados.hasNext()) {
			ElementoVisitado elemento = (ElementoVisitado) listadoDeEmpleados.next();
			elemento.aceptarVisita(this);
		}
		mostrarListado();
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public void agregarEmpleado(Empleado empleado) {
		this.empleados.add(empleado);
	}

	private void mostrarListado() {
		Iterator listadoDeEmpleados = empleados.iterator();
		while (listadoDeEmpleados.hasNext()) {
			Empleado empleado = (Empleado) listadoDeEmpleados.next();
			System.out.println("Nombre: " + empleado.getNombre() + "\t-> Salario: " + empleado.getSalario());
		}
	}

}
