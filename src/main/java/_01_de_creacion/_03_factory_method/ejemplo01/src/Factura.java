package _01_de_creacion._03_factory_method.ejemplo01.src;

public abstract class Factura {

	private int id;
	private double importe;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double getImporteIva();
}