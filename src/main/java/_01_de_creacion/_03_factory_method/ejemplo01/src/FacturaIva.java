package _01_de_creacion._03_factory_method.ejemplo01.src;

public class FacturaIva extends Factura {

	@Override
	public double getImporteIva() {
		return getImporte() * 1.21;
	}
}