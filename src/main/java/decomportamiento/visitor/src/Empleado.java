package decomportamiento.visitor.src;


public class Empleado implements IElementoVisitado {

	private String nombre = "";
	private double salario;
	private double salarioBase;
	private int cantidadDeHijos;
	private int antiguiedad;

	public Empleado(String nombre, double salarioBase, int cantidadDeHijos, int antiguiedad) {
		this.nombre = nombre;
		this.antiguiedad = antiguiedad;
		this.cantidadDeHijos = cantidadDeHijos;
		this.salarioBase = salarioBase;
	}

	public int getAntiguiedad() {
		return antiguiedad;
	}

	public void setAntiguiedad(int antiguiedad) {
		this.antiguiedad = antiguiedad;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void aceptarVisita(IVisitador visitador) {
		visitador.visitar(this);
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
}
