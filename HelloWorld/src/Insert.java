import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {

	public static void main(String[] args) {
		Statement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");
			instruccion = conexion.createStatement();
			String query = "INSERT INTO gestor (usuario, password, correo) VALUES ('gestorX','hdahgdhdhad', 'gestorX@correo.com')";
			/* Primera FORMA de ejecutar */
			boolean resultado = instruccion.execute(query);
			if (!resultado) {

				System.out.println("Registros insertados: " + instruccion.getUpdateCount());
			}
			/* 2a FORMA de ejecutar */
			int registrosInsertados = instruccion.executeUpdate(query);
			System.out.println("Registros insertados: " + registrosInsertados);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultados != null) {
					resultados.close();
				}

				if (instruccion != null) {
					instruccion.close();
				}

				if (conexion != null) {
					conexion.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
