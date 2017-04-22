/*
 * Created on 20/08/2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */


/**
 * @author LOCO
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class Persona {
	private String nombre;
	private int edad;
	private String direccion;
	
	public Persona(String nombre, int edad, String direccion) {
		setNombre(nombre);
		setDireccion(direccion);
		setEdad(edad);
	}
	
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
