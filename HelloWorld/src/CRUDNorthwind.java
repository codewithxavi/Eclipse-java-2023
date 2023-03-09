import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUDNorthwind {

	public static void main(String[] args) {
		Statement instruccion = null;
		ResultSet resultados = null;
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
			instruccion = conexion.createStatement();

			/* Insert */
			String queryInsert = "INSERT INTO customers (CustomerID, CompanyName, ContactName, ContactTitle, Address, City, Region, PostalCode, Country, Phone, Fax) VALUES ('XAVI2', 'Xavis Company TM', 'Xavi Adrian', 'President', 'Calle Caballero', 'Barcelona', 'Barcelona', '08018', 'Spain', '123456789', NULL)";
			int registrosInsertados = instruccion.executeUpdate(queryInsert);
			System.out.println("Registros insertados: " + registrosInsertados);
			/* /Insert */

			/* Select */
			String querySelect = "SELECT * FROM customers WHERE Country = 'Spain'";
			resultados = instruccion.executeQuery(querySelect);
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
			String queryUpdate = "UPDATE customers SET ContactName = 'New Contact Name' WHERE CustomerID = 'XAVII'";
			int registrosActualizados = instruccion.executeUpdate(queryUpdate);
			System.out.println("Registros actualizados: " + registrosActualizados);
			/* /Update */

			/* Delete */
			String queryDelete = "DELETE FROM customers WHERE CustomerID = 'XAVII'";
			int registrosEliminados = instruccion.executeUpdate(queryDelete);
			System.out.println("Registros eliminados: " + registrosEliminados);
			/* /Delete */

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
