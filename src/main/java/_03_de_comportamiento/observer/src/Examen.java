package _03_de_comportamiento.observer.src;

import java.util.Date;

public class Examen {

	private String materia;
	private Date fecha;

	public Date getFecha() {
		return fecha;
	}

	public String getMateria() {
		return materia;
	}

	public void setFecha(Date date) {
		fecha = date;
	}

	public void setMateria(String string) {
		materia = string;
	}

}
