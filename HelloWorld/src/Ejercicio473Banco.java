import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Ejercicio473Banco {

	public static void main(String[] args) {
		try {

			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");

			System.out.println("Base de datos: " + conexion.getMetaData().getDatabaseProductName());

			System.out.println("Versión: " + conexion.getMetaData().getDatabaseProductVersion());

			System.out.println("Driver: " + conexion.getMetaData().getDriverName());

			System.out.println("Versión del driver: " + conexion.getMetaData().getDriverVersion());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public class Ciente {

		private int id, id_gestor;
		private String usuario, password, correo;
		private double saldo;

		// Getters & Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getId_gestor() {
			return id_gestor;
		}

		public void setId_gestor(int id_gestor) {
			this.id_gestor = id_gestor;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

	}

	public class Gestor {
		private int id;
		private String usuario, password, correo;

		// Getters & Setters
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsuario() {
			return usuario;
		}

		public void setUsuario(String usuario) {
			this.usuario = usuario;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

	}
}
