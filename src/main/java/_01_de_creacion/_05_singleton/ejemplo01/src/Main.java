package _01_de_creacion._05_singleton.ejemplo01.src;

public class Main {

	public static void main(String[] args) {
		System.out.println(Singleton.getInstance("FOO"));
		System.out.println(Singleton.getInstance("BAR"));
		System.out.println(Singleton.getInstance("ABC"));
	}
}