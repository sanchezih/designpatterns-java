package _01_de_creacion._01_abstract_factory.ejemplo01.src;

public class ProductorasDeBedidasFactory {
	
	public AbstractFactory crearCocaColaFactory() {
		return new CocaColaCompanyFactory();
	}

	public AbstractFactory creaPepsiColaFactory() {
		return new PepsiCoFactory();
	}

}
