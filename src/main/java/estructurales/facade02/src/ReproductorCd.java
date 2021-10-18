package estructurales.facade02.src;

public class ReproductorCd {
	String description;
	String titulo;

	public ReproductorCd(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " prendido");
	}

	public void off() {
		System.out.println(description + " apagado");
	}

	public void eject() {
		titulo = null;
		System.out.println(description + " expulsando cd");
	}

	public void play(String titulo) {
		this.titulo = titulo;
		System.out.println(description + " ejecutanto \"" + titulo + "\"");
	}

	public void stop() {
		System.out.println(description + " parar");
	}

	public void pause() {
		System.out.println(description + " pausa \"" + titulo + "\"");
	}

	public String toString() {
		return description;
	}
}
