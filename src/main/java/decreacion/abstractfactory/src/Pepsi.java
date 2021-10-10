package decreacion.abstractfactory.src;
/*
 * Created on 28/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Pepsi extends BebidaDeColaAbstracta {

	public Pepsi() {
		setNombre("Pepsi");
	}
	
	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
