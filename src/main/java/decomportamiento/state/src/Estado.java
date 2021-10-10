package decomportamiento.state.src;

public abstract class Estado {
	private Persona persona = null;

	public Estado(Persona persona) {
		this.persona = persona;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public abstract void correr();

	public abstract void trabajar();

	public abstract void comer();

	public abstract void enfermar();

	public abstract void morir();
}
