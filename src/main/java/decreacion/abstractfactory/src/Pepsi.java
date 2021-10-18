package decreacion.abstractfactory.src;

public class Pepsi extends BebidaDeColaAbstracta {

	public Pepsi() {
		setNombre("Pepsi");
	}

	public void preparar() {
		System.out.println("Preparando: " + getNombre());
	}

}
