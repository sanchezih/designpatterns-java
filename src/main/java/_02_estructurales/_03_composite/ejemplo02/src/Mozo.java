package _02_estructurales._03_composite.ejemplo02.src;

public class Mozo {
	ComponenteMenu menues;

	public Mozo(ComponenteMenu menues) {
		this.menues = menues;
	}

	public void printMenu() {
		menues.print();
	}
}
