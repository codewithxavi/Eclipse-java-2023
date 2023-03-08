import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatements {

	public static void main(String[] args) {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");
			// antes de comenzar a utilizar transacciones es fundamental cambiar el valor  del autoCommit a false
			conexion.setAutoCommit(false);
			// primera sentencia SQL que formará parte de la transacción
			PreparedStatement ps1 = conexion.prepareStatement("INSERT INTO gestor(usuario,password, correo) VALUES (?,?,?) ");
			ps1.setString(1, "gestor10");
			ps1.setString(2, "gestor10");
			ps1.setString(3, "gestor10@correo.com");
			// segunda sentencia SQL que formará parte de la transacción
			PreparedStatement ps2 = conexion.prepareStatement("INSERT INTO gestor(usuario,password, correo) VALUES (?,?,?) ");
			ps2.setString(1, "gestor11");
			ps2.setString(2, "gestor11");
			ps2.setString(3, "gestor11@correo.com");
			// tercera sentencia SQL que formará parte de la transacción
			PreparedStatement ps3 = conexion.prepareStatement("INSERT INTO gestor(usuario,password, correo) VALUES (?,?,?) ");
			ps3.setString(1, "gestor12");
			ps3.setString(2, "gestor12");
			ps3.setString(3, "gestor12@correo.com");
			// cuarta sentencia SQL que formará parte de la transacción y fallará si existe un registro con id = 4
			PreparedStatement ps4 = conexion.prepareStatement("INSERT INTO gestor(id,usuario, password, correo) VALUES (?,?,?,?) ");
			ps4.setInt(1, 4);
			ps4.setString(2, "gestor12");
			ps4.setString(3, "gestor12");
			ps4.setString(4, "gestor12@correo.com");
			// se añaden todas las sentencias SQL a la transacción
			ps1.execute();
			ps2.execute();
			ps3.execute();
			//ps4.execute();
			// se ejecutan todas las sentencias SQL de la transacción
			conexion.commit();
			System.out.println("Programa finalizado");
			// captura de la excepción SQLException (en el caso en que se produzca)
		} catch (SQLException e) {
			if (conexion != null) {
				try {
					// se realiza un rollback de la transacción, liberando el bloqueo de la base de datos
					conexion.rollback();
					System.out.println("Rollback realizado");
					// el rollback puede arrojar también una excepción de tipo SQLException
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
				// muestra información si la transacción falló
				e.printStackTrace();
			}
		}

	}

}
