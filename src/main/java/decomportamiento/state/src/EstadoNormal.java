package decomportamiento.state.src;
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
public class EstadoNormal extends Estado {

	/**
	 * @param persona
	 */
	public EstadoNormal(Persona persona) {
		super(persona);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#correr()
	 */
	public void correr() {
		System.out.println("Puedo correr");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#trabajar()
	 */
	public void trabajar() {
		System.out.println("Puedo trabajar");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#comer()
	 */
	public void comer() {
		System.out.println("Puedo comer");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#enfermar()
	 */
	public void enfermar() {
		getPersona().setEstado(new EstadoEnfermo(getPersona()));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#morir()
	 */
	public void morir() {
		getPersona().setEstado(new EstadoMuerto(getPersona()));
	}

}
