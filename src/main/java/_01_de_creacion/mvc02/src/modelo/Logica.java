package _01_de_creacion.mvc02.src.modelo;

import javax.swing.JOptionPane;

import _01_de_creacion.mvc02.src.controlador.Coordinador;
import _01_de_creacion.mvc02.src.modelo.dao.PersonaDao;
import _01_de_creacion.mvc02.src.modelo.vo.PersonaVo;

public class Logica {

	private Coordinador miCoordinador;
	public static boolean consultaPersona = false;
	public static boolean modificaPersona = false;

	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;

	}

	public void validarRegistro(PersonaVo miPersona) {
		PersonaDao miPersonaDao;
		if (miPersona.getIdPersona() > 99) {
			miPersonaDao = new PersonaDao();
			miPersonaDao.registrarPersona(miPersona);
		} else {
			JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);

		}

	}

	public PersonaVo validarConsulta(String codigoPersona) {
		PersonaDao miPersonaDao;

		try {
			int codigo = Integer.parseInt(codigoPersona);
			if (codigo > 99) {
				miPersonaDao = new PersonaDao();
				consultaPersona = true;
				return miPersonaDao.buscarPersona(codigo);
			} else {
				JOptionPane.showMessageDialog(null, "El documento de la persona debe ser mas de 3 digitos",
						"Advertencia", JOptionPane.WARNING_MESSAGE);
				consultaPersona = false;
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
			consultaPersona = false;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
			consultaPersona = false;
		}

		return null;
	}

	public void validarModificacion(PersonaVo miPersona) {
		PersonaDao miPersonaDao;
		if (miPersona.getNombrePersona().length() > 5) {
			miPersonaDao = new PersonaDao();
			miPersonaDao.modificarPersona(miPersona);
			modificaPersona = true;
		} else {
			JOptionPane.showMessageDialog(null, "El nombre de la persona debe ser mayor a 5 digitos", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
			modificaPersona = false;
		}
	}

	public void validarEliminacion(String codigo) {
		PersonaDao miPersonaDao = new PersonaDao();
		miPersonaDao.eliminarPersona(codigo);
	}

}
