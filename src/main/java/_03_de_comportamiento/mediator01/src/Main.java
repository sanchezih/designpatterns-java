package _03_de_comportamiento.mediator01.src;

public class Main {

	public static void main(String[] args) {

		MediadorConcreto mediador = new MediadorConcreto();
	
		Amigo amigoJuan = new AmigoConcreto("Juan", mediador);
		Amigo amigoPedro = new AmigoConcreto("Pedro", mediador);

		mediador.setAmigoJuan(amigoJuan);
		mediador.setAmigoPedro(amigoPedro);

		amigoJuan.enviarTexto("Hola todo ok?");
		amigoPedro.enviarTexto("Si todo ok!!!");

	}
}
