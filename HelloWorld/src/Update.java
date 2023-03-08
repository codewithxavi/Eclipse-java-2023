import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Statement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		Scanner scanner = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");
			instruccion = conexion.createStatement();
			scanner = new Scanner(System.in);
			System.out.print("Introduce el ID del gestor a actualizar: ");
			int id = scanner.nextInt();
			String sql = "UPDATE gestor SET usuario = 'gestor actualizado' WHERE id = " + id;
			boolean rowsUpdated = instruccion.execute(sql);
			if (!rowsUpdated) {
				System.out.println("Registro actualizado correctamente");
			}
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
