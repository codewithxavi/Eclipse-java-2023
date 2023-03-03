import java.util.Scanner;

public class EjercicioProyectoMain5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String opcion = "";
		boolean jugarDeNuevo = true;
		boolean opcionGestoresSeleccionada = false;
		boolean primerIngreso = true;

		do {
			System.out.println("----- Comienzo del juego -----");

			while (!opcion.equalsIgnoreCase("S") && !opcion.equals("1")) {
				System.out.println("1 --> Gestores");
				System.out.println("2 --> Clientes");
				System.out.println("3 --> Transferencias");
				System.out.println("4 --> Mensajes");
				System.out.println("5 --> Préstamos");
				System.out.println("S --> Salir");
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
			}

			opcion = "";

		} while (jugarDeNuevo);

		System.out.println("----- Fin del juego -----");

		scanner.close();

	}

	public static void MostrarGestores() {
		Scanner scanner = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("Ha seleccionado Gestores.");
			System.out.println("1 - Añadir gestor");
			System.out.println("2 - Modificar gestor");
			System.out.println("3 - Eliminar gestor");
			System.out.println("4 - Ver gestor");
			System.out.println("5 - Ver gestores");
			System.out.println("6 - Volver");
			System.out.println("Introduzca un número del 1-6:");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado añadir gestor.");
				// Aquí iría el código para añadir un gestor
				break;
			case "2":
				System.out.println("Ha seleccionado modificar gestor.");
				// Aquí iría el código para modificar un gestor
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar gestor.");
				// Aquí iría el código para eliminar un gestor
				break;
			case "4":
				System.out.println("Ha seleccionado ver gestor.");
				// Aquí iría el código para ver un gestor
				break;
			case "5":
				System.out.println("Ha seleccionado ver gestores.");
				// Aquí iría el código para ver todos los gestores
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				// Aquí iría el código para mostrar un mensaje de error o volver a pedir una
				// opción válida
				break;
			}
		} while (!opcion.equals("6"));
		
	
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

	static class Gestor {
		String nombre;

	}
}
