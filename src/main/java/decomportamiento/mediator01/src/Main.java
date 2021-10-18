package decomportamiento.mediator01.src;

public class Main {

	public static void main(String[] args) {
		MediadorConcreto mediador = new MediadorConcreto();
		Amigo ammigoJuan = new AmigoConcreto("Juan", mediador);
		Amigo amigoPedro = new AmigoConcreto("Pedro", mediador);

		mediador.setAmigoJuan(ammigoJuan);
		mediador.setAmigoPedro(amigoPedro);

		ammigoJuan.enviarTexto("Hola todo ok?");
		amigoPedro.enviarTexto("Si todo ok!!!");

	}
}
