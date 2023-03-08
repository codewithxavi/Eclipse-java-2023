import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MetadatosConsulta {

	public static void main(String[] args) {

		Connection conexion = null;

		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "banco", "Banco12345$");

			Statement instruccion = conexion.createStatement();
			String query = "SELECT * FROM gestor";
			ResultSet resultados = instruccion.executeQuery(query);
			
			// devuelve el número de columnas
			System.out.println(resultados.getMetaData().getColumnCount());
			
			// devuelve el nombre de la primera columna
			System.out.println(resultados.getMetaData().getColumnName(1));
			
			// devuelve el tipo de dato de la primera columna (un número entero)
			// https://docs.oracle.com/javase/8/docs/api/constant-values.html#java.sql
			System.out.println(resultados.getMetaData().getColumnType(1));

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
