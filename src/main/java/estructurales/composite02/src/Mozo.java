package estructurales.composite02.src;

public class Mozo {
	ComponenteMenu menues;

	public Mozo(ComponenteMenu menues) {
		this.menues = menues;
	}

	public void printMenu() {
		menues.print();
	}
}
