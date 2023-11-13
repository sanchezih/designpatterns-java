package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public abstract class BebidaDeColaAbstracta {

	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void preparar();

}
