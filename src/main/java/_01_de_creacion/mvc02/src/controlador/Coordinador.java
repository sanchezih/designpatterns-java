package _01_de_creacion.mvc02.src.controlador;

import _01_de_creacion.mvc02.src.modelo.Logica;
import _01_de_creacion.mvc02.src.modelo.vo.PersonaVo;
import _01_de_creacion.mvc02.src.vista.VentanaBuscar;
import _01_de_creacion.mvc02.src.vista.VentanaPrincipal;
import _01_de_creacion.mvc02.src.vista.VentanaRegistro;

public class Coordinador {

	private Logica miLogica;
	private VentanaPrincipal miVentanaPrincipal;
	private VentanaRegistro miVentanaRegistro;
	private VentanaBuscar miVentanaBuscar;

	public VentanaPrincipal getMiVentanaPrincipal() {
		return miVentanaPrincipal;
	}

	public void setMiVentanaPrincipal(VentanaPrincipal miVentanaPrincipal) {
		this.miVentanaPrincipal = miVentanaPrincipal;
	}

	public VentanaRegistro getMiVentanaRegistro() {
		return miVentanaRegistro;
	}

	public void setMiVentanaRegistro(VentanaRegistro miVentanaRegistro) {
		this.miVentanaRegistro = miVentanaRegistro;
	}

	public VentanaBuscar getMiVentanaBuscar() {
		return miVentanaBuscar;
	}

	public void setMiVentanaBuscar(VentanaBuscar miVentanaBuscar) {
		this.miVentanaBuscar = miVentanaBuscar;
	}

	public Logica getMiLogica() {
		return miLogica;
	}

	public void setMiLogica(Logica miLogica) {
		this.miLogica = miLogica;
	}

	//////////////////////////////////////////////////////////

	public void mostrarVentanaRegistro() {
		miVentanaRegistro.setVisible(true);
	}

	public void mostrarVentanaConsulta() {
		miVentanaBuscar.setVisible(true);
	}

	public void registrarPersona(PersonaVo miPersona) {
		miLogica.validarRegistro(miPersona);
	}

	public PersonaVo buscarPersona(String codigoPersona) {
		return miLogica.validarConsulta(codigoPersona);
	}

	public void modificarPersona(PersonaVo miPersona) {
		miLogica.validarModificacion(miPersona);
	}

	public void eliminarPersona(String codigo) {
		miLogica.validarEliminacion(codigo);
	}

}
