import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUDNorthwindPreparedStatements {

	public static void main(String[] args) {
		PreparedStatement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");

			/* Insert */
			String queryInsert = "INSERT INTO customers (CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			instruccion = conexion.prepareStatement(queryInsert);
			instruccion.setString(1, "XAVI3");
			instruccion.setString(2, "Xavis Company TM");
			instruccion.setString(3, "Xavi Adrian");
			instruccion.setString(4, "President");
			instruccion.setString(5, "Calle Caballero");
			instruccion.setString(6, "Barcelona");
			instruccion.setString(7, "Barcelona");
			instruccion.setString(8, "08018");
			instruccion.setString(9, "Spain");
			instruccion.setString(10, "123456789");
			instruccion.setString(11, null);
			int registrosInsertados = instruccion.executeUpdate();
			System.out.println("Registros insertados: " + registrosInsertados);
			/* /Insert */

			/* Select */
			String querySelect = "SELECT * FROM customers WHERE Country = ?";
			instruccion = conexion.prepareStatement(querySelect);
			instruccion.setString(1, "Spain");
			resultados = instruccion.executeQuery();
			while (resultados.next()) {
				String customerId = resultados.getString("CustomerID");
				String companyName = resultados.getString("CompanyName");
				String contactName = resultados.getString("ContactName");
				String contactTitle = resultados.getString("ContactTitle");
				String address = resultados.getString("Address");
				String city = resultados.getString("City");
				String region = resultados.getString("Region");
				String postalCode = resultados.getString("PostalCode");
				String country = resultados.getString("Country");
				String phone = resultados.getString("Phone");
				String fax = resultados.getString("Fax");
				System.out.println(customerId + "\t" + companyName + "\t" + contactName + "\t" + contactTitle + "\t"
						+ address + "\t" + city + "\t" + region + "\t" + postalCode + "\t" + country + "\t" + phone
						+ "\t" + fax);
			}
			/* /Select */

			/* Update */
			String queryUpdate = "UPDATE customers SET ContactName = ? WHERE CustomerID = ?";
			instruccion = conexion.prepareStatement(queryUpdate);
			instruccion.setString(1, "New Contact Name");
			instruccion.setString(2, "XAVII");
			int registrosActualizados = instruccion.executeUpdate();
			System.out.println("Registros actualizados: " + registrosActualizados);
			/* /Update */

			/* Delete */
			String queryDelete = "DELETE FROM customers WHERE CustomerID = ?";
			instruccion = conexion.prepareStatement(queryDelete);
			instruccion.setString(1, "XAVII");
			int registrosEliminados = instruccion.executeUpdate();
			System.out.println("Registros eliminados: " + registrosEliminados);
			/* /Delete */

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (resultados != null)
					resultados.close();
				if (instruccion != null)
					instruccion.close();
				if (conexion != null)
					conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
