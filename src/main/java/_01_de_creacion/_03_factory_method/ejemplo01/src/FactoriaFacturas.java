package _01_de_creacion._03_factory_method.ejemplo01.src;

public class FactoriaFacturas {

	private final static String FACTURA_STANDARD = "iva";

	/**
	 * 
	 * @param tipo
	 * @return
	 */
	public static Factura getFactura(String tipo) {
		if (tipo.equals(FACTURA_STANDARD)) {
			return new FacturaConIvaStandard();
		} else {
			return new FacturaConIvaReducido();
		}
	}
}