package decreacion.abstractfactory.src;

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
