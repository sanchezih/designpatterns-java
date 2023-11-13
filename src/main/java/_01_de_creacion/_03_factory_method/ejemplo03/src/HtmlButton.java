package _01_de_creacion._03_factory_method.ejemplo03.src;

/**
 * HTML button implementation.
 */
public class HtmlButton implements Button {

	public void render() {
		System.out.println("<button>Test Button</button>");
		onClick();
	}

	public void onClick() {
		System.out.println("Click! Button says - 'Hello World!'");
	}
}