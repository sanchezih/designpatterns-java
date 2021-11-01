package decreacion.abstractfactory.src;

public abstract class BebidaDeNaranjaAbstracta {
	private int cantidadDeNaranjas = 0;
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadDeNaranjas() {
		return cantidadDeNaranjas;
	}

	public void setCantidadDeNaranjas(int cantidadDeNaranjas) {
		this.cantidadDeNaranjas = cantidadDeNaranjas;
	}

	public abstract void preparar();

}
