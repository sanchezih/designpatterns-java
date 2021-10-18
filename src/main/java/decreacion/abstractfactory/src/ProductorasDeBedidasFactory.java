package decreacion.abstractfactory.src;

public class ProductorasDeBedidasFactory {
	public AbstractFactory crearCocaColaFactory() {
		return new CocaColaFactory();
	}

	public AbstractFactory creaPepsiColaFactory() {
		return new PepsiColaFactory();
	}

}
