package _03_de_comportamiento.cor02.src;

public class Gerente extends Aprobador {

	public Gerente(Aprobador sucesor) {
		super(sucesor);
	}
	
	public void manejarPedido(double monto) {
		if(monto >= 5000 && monto <= 10000) {
			System.out.println("Soy Gerente y puedo manejar los montos de entre 5000 y 10000");
		} else {
			getSucesor().manejarPedido(monto);
		}
	}

}
