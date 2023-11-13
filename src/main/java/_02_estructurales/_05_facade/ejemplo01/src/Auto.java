package _02_estructurales._05_facade.ejemplo01.src;

public class Auto {
	private String modelo;
	private double precio;

	public String getModelo() {
		return modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
