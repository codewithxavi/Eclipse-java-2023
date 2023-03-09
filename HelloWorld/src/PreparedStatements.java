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
			
			PreparedStatement psUpdate = conexion.prepareStatement("UPDATE gestor SET password = ? WHERE id = ?");
			psUpdate.setString(1, "nuevaContraseña");
			psUpdate.setInt(2, 1); // aquí se puede cambiar 1 por el ID del gestor que se quiera actualizar
			int rowsAffected = psUpdate.executeUpdate();
			System.out.println(rowsAffected + " registro(s) actualizado(s)");

			 // Preparar sentencia SQL para borrar un gestor
            PreparedStatement psDelete = conexion.prepareStatement("DELETE FROM gestor WHERE id = ?");
            ps4.setInt(1, 4);
			
			// se añaden todas las sentencias SQL a la transacción
			ps1.execute();
			ps2.execute();
			ps3.execute();
			//ps4.execute();
			psUpdate.execute();
			//psDelete.execute();
	
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
