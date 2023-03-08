import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) {
		Statement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");
			instruccion = conexion.createStatement();
			String sql = "DELETE FROM gestor WHERE id = 9";
			boolean resultado = instruccion.execute(sql);
			if (!resultado) {
				System.out.println("Record deleted successfully");
			} else {
				System.out.println("No records were deleted");
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
