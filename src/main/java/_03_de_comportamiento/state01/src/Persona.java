package _03_de_comportamiento.state01.src;

public class Persona {

	private Estado estado;

	public Persona() {
		setEstado(new EstadoNormal(this));
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
	public void correr() {
		estado.correr();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#trabajar()
	 */
	public void trabajar() {
		estado.trabajar();

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#comer()
	 */
	public void comer() {
		estado.comer();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#enfermar()
	 */
	public void enfermar() {
		estado.enfermar();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#morir()
	 */
	public void morir() {
		estado.morir();
	}

}
