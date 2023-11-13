package _01_de_creacion.mvc02.src.modelo.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	static String bd = "codejavu";
	static String login = "root";
	static String password = "qwerty";
	static String url = "jdbc:mysql://localhost/" + bd;

	Connection conn = null;

	/** Constructor de DbConnection */
	public Conexion() {
		try {
			// obtenemos el driver de para mysql
			Class.forName("com.mysql.jdbc.Driver");
			// obtenemos la conexion
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("Coneccion a base de datos " + bd + " OK");
			}
		} catch (SQLException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	/** Permite retornar la conexion */
	public Connection getConnection() {
		return conn;
	}

	public void desconectar() {
		conn = null;
	}

}