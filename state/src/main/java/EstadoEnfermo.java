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
public class EstadoEnfermo extends Estado {

	public EstadoEnfermo(Persona persona) {
		super(persona);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#correr()
	 */
	public void correr() {
		System.out.println("No puedo correr estoy enfermo");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#trabajar()
	 */
	public void trabajar() {
		System.out.println("No puedo trabajar estoy enfermo");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#comer()
	 */
	public void comer() {
		System.out.println("Puedo comer pero estoy enfermo");

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see Estado#enfermar()
	 */
	public void enfermar() {

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
