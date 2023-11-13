package _01_de_creacion._03_factory_method.ejemplo01.src;

public class FacturaConIvaReducido extends Factura {

	private final static double IVA = 1.07;

	@Override
	public double getImporteIva() {
		return getImporte() * IVA;
	}
}