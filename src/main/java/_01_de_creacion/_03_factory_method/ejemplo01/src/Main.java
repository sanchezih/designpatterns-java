package _01_de_creacion._03_factory_method.ejemplo01.src;

public class Main {

	public static void main(String[] args) {

		Factura factura = FactoriaFacturas.getFactura("iva");
		factura.setId(1);
		factura.setImporte(100);
		System.out.println(factura.getImporteIva());
	}

}