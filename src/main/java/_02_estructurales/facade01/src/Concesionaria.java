package _02_estructurales.facade01.src;

public class Concesionaria {

	/**
	 * 
	 * @param auto
	 * @param cliente
	 * @return
	 */
	public boolean verificarVentaDirectaDeAuto(Auto auto, Cliente cliente) {
		boolean venta = true;
		Banco banco = new Banco();

		if (banco.calcularCreditoMaximo(cliente) < auto.getPrecio()) {
			venta = false;
		}

		FabricaDeAutos fabricaDeAutos = new FabricaDeAutos();
		venta = fabricaDeAutos.hayEnStock(auto);

		EmpresaDeTransporte empresaDeTransporte = new EmpresaDeTransporte();
		venta = empresaDeTransporte.puedeEntregarAuto(auto, cliente);

		return venta;

	}
}
