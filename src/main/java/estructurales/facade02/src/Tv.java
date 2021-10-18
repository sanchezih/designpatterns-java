package estructurales.facade02.src;

public class Tv {
	String description;

	public Tv(String description) {
		this.description = description;
	}

	public void on() {
		System.out.println(description + " prendido");
	}

	public void off() {
		System.out.println(description + " apagado");
	}

	public void wideScreenMode() {
		System.out.println(description + " en modeo widescreen");
	}

	public void tvMode() {
		System.out.println(description + " en modo normal ");
	}

	public String toString() {
		return description;
	}
}
