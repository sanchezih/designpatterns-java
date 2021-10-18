package decomportamiento.state01.src;
/*
 * Created on 10/10/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 *         TODO To change the template for this generated type comment go to
 *         Window - Preferences - Java - Code Style - Code Templates
 */
public class Persona {

	private Estado estado;

	public Persona() {
		setEstado(new EstadoNormal(this));
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#correr()
	 */
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
