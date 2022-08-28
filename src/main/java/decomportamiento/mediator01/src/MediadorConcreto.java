package decomportamiento.mediator01.src;

public class MediadorConcreto extends Mediador {

	private Amigo amigoJuan = null;
	private Amigo amigoPedro = null;

	public void setAmigoJuan(Amigo amigoJuan) {
		this.amigoJuan = amigoJuan;
	}

	public void setAmigoPedro(Amigo amigoPedro) {
		this.amigoPedro = amigoPedro;
	}

	public void enviarTexto(String texto, Amigo amigo) {
		if (amigo.equals(amigoJuan)) {
			amigoPedro.recibirTexto(texto);
		} else if (amigo.equals(amigoPedro)) {
			amigoJuan.recibirTexto(texto);
		}
	}

}
