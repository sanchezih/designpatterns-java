package _02_estructurales.facade02.src;

public class Radio {
	String descripcion;
	String frecuencia;

	public Radio(String description) {
		this.descripcion = description;
	}

	public void on() {
		System.out.println(descripcion + " prendido");
	}

	public void off() {
		System.out.println(descripcion + " apagado");
	}

	public void setFrecuencia(String frecuencia) {
		System.out.println(descripcion + " seteando la frecuencia  " + frecuencia);
		this.frecuencia = frecuencia;
	}

	public void setAm() {
		System.out.println(descripcion + " seteando AM ");
	}

	public void setFm() {
		System.out.println(descripcion + " seteando FM ");
	}

	public String toString() {
		return descripcion;
	}
}
