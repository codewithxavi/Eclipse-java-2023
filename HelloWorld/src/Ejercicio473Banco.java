import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class Ejercicio473Banco {

	public static void main(String[] args) {

		java.sql.Statement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");
			System.out.println("Base de datos: " + conexion.getMetaData().getDatabaseProductName());
			System.out.println("Versión: " + conexion.getMetaData().getDatabaseProductVersion());
			System.out.println("Driver: " + conexion.getMetaData().getDriverName());
			System.out.println("Versión del driver: " + conexion.getMetaData().getDriverVersion());

			instruccion = conexion.createStatement();

			
			
//	         String sql = "DELETE FROM gestor WHERE id = 9";
//
//	        
//			 boolean resultado = instruccion.execute(sql);
//
//	        
//	         if (!resultado) {
//	            System.out.println("Record deleted successfully");
//	         } else {
//	            System.out.println("No records were deleted");
//	         }
			
			
			
			 
//			 String query =
//			 "INSERT INTO gestor (usuario, password, correo) VALUES ('gestor10','gestor10', 'gestor10@correo.com')"
//			 ;
//			 
//			 boolean resultado = instruccion.execute(query);
//			 
//			 if (!resultado) {
//			 
//			 System.out.println("Registros insertados: " + instruccion.getUpdateCount());
//			 }
//			 
//			 int registrosInsertados = instruccion.executeUpdate(query);
//			 
//			 System.out.println("Registros insertados: " + registrosInsertados);
			 
			 

//			String query = "SELECT * FROM gestor";
//			ResultSet resultados1 = instruccion.executeQuery(query);
//			System.out.println("Listado de gestores (con executeQuery): ");
//			while (resultados1.next()) {
//				System.out.println("Gestor " + resultados1.getInt("id"));
//				System.out.println("Usuario: " + resultados1.getString("usuario"));
//				System.out.println("Password: " + resultados1.getString("password"));
//				System.out.println("Correo: " + resultados1.getString("correo"));
//				System.out.println("...");
//			}
//			boolean resultado = instruccion.execute(query);
//			if (resultado) {
//				ResultSet resultados2 = instruccion.getResultSet();
//
//				System.out.println("Listado de gestores (con execute): ");
//				while (resultados2.next()) {
//					System.out.println("Gestor " + resultados2.getInt("id"));
//					System.out.println("Usuario: " + resultados2.getString("usuario"));
//					System.out.println("Password: " + resultados2.getString("password"));
//					System.out.println("Correo: " + resultados2.getString("correo"));
//					System.out.println("...");
//				}
//			}
			
			

//			String sql = "UPDATE gestor SET usuario = 'gestor1!' WHERE id = 1";
//
//			boolean rowsUpdated = instruccion.execute(sql);
//
//			if (!rowsUpdated) {
//				System.out.println("Record updated successfully");
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		/*finally {
			try {
				if (resultados != null) {
					resultados.close();
				}

				if (instruccion != null) {
					((Connection) instruccion).close();
				}

				if (conexion != null) {
					conexion.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}*/

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
