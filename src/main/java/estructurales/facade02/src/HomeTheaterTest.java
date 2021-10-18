package estructurales.facade02.src;

public class HomeTheaterTest {

	public static void main(String[] args) {

		Radio radio = new Radio("Iniciando AM/FM Radio");
		ReproductorDvd dvd = new ReproductorDvd("Iniciando Reproductor de DVD");
		ReproductorCd cd = new ReproductorCd("Iniciando Reproductor de CD");
		Tv tv = new Tv("Iniciando Tv");

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(radio, dvd, cd, tv);

		homeTheater.mirandoPelicula(" harry potter y las reliquias de la muerte ");
		homeTheater.apagandoPelicula();

		System.out.println("--------------------");
		homeTheater.escucharCd("Grandes Exitos de Sandro");
		homeTheater.apagarCd();

		System.out.println("--------------------");
		homeTheater.escucharRadio("100.5");
		homeTheater.apagarRadio();
	}
}
