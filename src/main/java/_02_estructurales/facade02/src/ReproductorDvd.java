package _02_estructurales.facade02.src;

public class ReproductorDvd {
	String description;
	String pelicula;

	public ReproductorDvd(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " prendido");
	}

	public void off() {
		System.out.println(description + " apagado");
	}

	public void eject() {
		pelicula = null;
		System.out.println(description + " expulsando");
	}

	public void play(String pelicula) {
		this.pelicula = pelicula;

		System.out.println(description + " reproducioendo \"" + pelicula + "\"");
	}

	public void stop() {

		System.out.println(description + " parando \"" + pelicula + "\"");
	}

	public void pause() {
		System.out.println(description + " pausando \"" + pelicula + "\"");
	}

	public String toString() {
		return description;
	}
}
