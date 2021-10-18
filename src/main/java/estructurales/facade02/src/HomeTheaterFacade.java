package estructurales.facade02.src;

public class HomeTheaterFacade {

	Radio radio;
	ReproductorDvd dvd;
	ReproductorCd cd;
	Tv tv;

	public HomeTheaterFacade(Radio radio, ReproductorDvd dvd, ReproductorCd cd, Tv tv) {
		this.radio = radio;
		this.dvd = dvd;
		this.cd = cd;
		this.tv = tv;
	}

	public void mirandoPelicula(String pelicula) {
		System.out.println("Prendiendo para mirar pelicula  ...");
		tv.on();
		tv.wideScreenMode();
		dvd.on();
		dvd.play(pelicula);
	}

	public void apagandoPelicula() {
		System.out.println("Apagando el reproductor de peliculas del home theater...");
		tv.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}

	public void escucharCd(String cdTitle) {
		System.out.println("Prendiendo CD...");
		cd.on();
		cd.play(cdTitle);
	}

	public void apagarCd() {
		System.out.println("Apagando CD...");
		cd.eject();
		cd.off();
	}

	public void escucharRadio(String frecuencia) {
		System.out.println("Prendiendo la radio y sintonizando...");
		radio.on();
		radio.setFrecuencia(frecuencia);

	}

	public void apagarRadio() {
		System.out.println("Apagando la radio...");
		radio.off();

	}
}
