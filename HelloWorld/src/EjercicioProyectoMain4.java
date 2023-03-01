import java.util.Scanner;

public class EjercicioProyectoMain4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String opcion = "";
		boolean jugarDeNuevo = true;

		do {
			System.out.println("----- Comienzo del juego -----");
			System.out.println("1 --> Gestores");
			System.out.println("2 --> Clientes");
			System.out.println("3 --> Transferencias");
			System.out.println("4 --> Mensajes");
			System.out.println("5 --> Préstamos");
			System.out.println("S --> Salir");

			while (!opcion.equalsIgnoreCase("S")) {
				System.out.println("Ingrese un número (opción):");
				opcion = scanner.nextLine();

				switch (opcion) {
				case "1":
					MostrarGestores();
					break;
				case "2":
					MostrarClientes();
					break;
				case "3":
					MostrarTransferencias();
					break;
				case "4":
					MostrarMensajes();
					break;
				case "5":
					MostrarPrestamos();
					break;
				case "S":
					System.out.println("Ha salido del programa.");
					break;
				case "s":
					System.out.println("Ha salido del programa.");
					break;
				default:
					System.out.println("Opción inválida.");
					break;
				}
			}

			System.out.println("¿Desea volver a jugar? (S/N)");
			String respuesta = scanner.nextLine();
			jugarDeNuevo = respuesta.equalsIgnoreCase("S");
			
			if (respuesta.equalsIgnoreCase("N")) {
				System.out.println("Ha salido del programa");
				// jugarDeNuevo = false;
			}
			
			opcion = "";

		} while (jugarDeNuevo);
		
		System.out.println("----- Fin del juego -----");

		scanner.close();

	}

	public static void MostrarGestores() {
		System.out.println("Ha seleccionado Gestores.");
	}

	public static void MostrarClientes() {
		System.out.println("Ha seleccionado Clientes.");
	}

	public static void MostrarTransferencias() {
		System.out.println("Ha seleccionado Transferencias.");
	}

	public static void MostrarMensajes() {
		System.out.println("Ha seleccionado Mensajes.");
	}

	public static void MostrarPrestamos() {
		System.out.println("Ha seleccionado Prestamos.");
	}
}
