package _03_de_comportamiento.mediator01.src;

public class AmigoConcreto extends Amigo {

	public AmigoConcreto(String nombre, Mediador mediador) {
		super(nombre, mediador);
	}

	public void recibirTexto(String texto) {
		System.out.println(getNombre() + " recibio un texto: " + texto);
	}

	public void enviarTexto(String texto) {
		getMediador().enviarTexto(texto, this);
	}

}
