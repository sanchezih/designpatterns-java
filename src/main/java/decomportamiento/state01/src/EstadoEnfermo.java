package decomportamiento.state01.src;

public class EstadoEnfermo extends Estado {

	public EstadoEnfermo(Persona persona) {
		super(persona);
	}

	public void correr() {
		System.out.println("No puedo correr estoy enfermo");
	}

	public void trabajar() {
		System.out.println("No puedo trabajar estoy enfermo");
	}

	public void comer() {
		System.out.println("Puedo comer pero estoy enfermo");
	}

	public void enfermar() {
	}

	public void morir() {
		getPersona().setEstado(new EstadoMuerto(getPersona()));
	}
}
