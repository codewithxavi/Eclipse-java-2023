import java.util.Scanner;

public class Ejercicio7Examen {

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
				break;
			case "2":
				System.out.println("Ha seleccionado modificar gestor.");
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar gestor.");
				break;
			case "4":
				System.out.println("Ha seleccionado ver gestor.");
				break;
			case "5":
				System.out.println("Ha seleccionado ver gestores.");
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				break;
			}
		} while (!opcion.equals("6"));

	}

	public static void MostrarClientes() {
		Scanner scanner = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("Ha seleccionado Clientes.");
			System.out.println("1 - Añadir cliente");
			System.out.println("2 - Modificar cliente");
			System.out.println("3 - Eliminar cliente");
			System.out.println("4 - Ver cliente");
			System.out.println("5 - Ver clientes");
			System.out.println("6 - Volver");
			System.out.println("Introduzca un número del 1-6:");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado añadir cliente.");
				break;
			case "2":
				System.out.println("Ha seleccionado modificar cliente.");
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar cliente.");
				break;
			case "4":
				System.out.println("Ha seleccionado ver cliente.");
				break;
			case "5":
				System.out.println("Ha seleccionado ver clientes.");
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				break;
			}
		} while (!opcion.equals("6"));
	}

	public static void MostrarTransferencias() {
		Scanner scanner = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("Ha seleccionado Transferencias.");
			System.out.println("1 - Añadir transferencia");
			System.out.println("2 - Modificar transferencia");
			System.out.println("3 - Eliminar transferencia");
			System.out.println("4 - Ver transferencia");
			System.out.println("5 - Ver transferencias");
			System.out.println("6 - Volver");
			System.out.println("Introduzca un número del 1-6:");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado añadir transferencia.");
				break;
			case "2":
				System.out.println("Ha seleccionado modificar transferencia.");
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar transferencia.");
				break;
			case "4":
				System.out.println("Ha seleccionado ver transferencia.");
				break;
			case "5":
				System.out.println("Ha seleccionado ver transferencias.");
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				break;
			}
		} while (!opcion.equals("6"));
	}

	public static void MostrarMensajes() {
		Scanner scanner = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("Ha seleccionado Mensajes.");
			System.out.println("1 - Añadir mensaje");
			System.out.println("2 - Modificar mensaje");
			System.out.println("3 - Eliminar mensaje");
			System.out.println("4 - Ver mensaje");
			System.out.println("5 - Ver mensajes");
			System.out.println("6 - Volver");
			System.out.println("Introduzca un número del 1-6:");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado añadir mensaje.");
				break;
			case "2":
				System.out.println("Ha seleccionado modificar mensaje.");
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar mensaje.");
				break;
			case "4":
				System.out.println("Ha seleccionado ver mensaje.");
				break;
			case "5":
				System.out.println("Ha seleccionado ver mensajes.");
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				break;
			}
		} while (!opcion.equals("6"));
	}

	public static void MostrarPrestamos() {
		Scanner scanner = new Scanner(System.in);
		String opcion;

		do {
			System.out.println("Ha seleccionado prestamos.");
			System.out.println("1 - Añadir prestamo");
			System.out.println("2 - Modificar prestamo");
			System.out.println("3 - Eliminar prestamo");
			System.out.println("4 - Ver prestamo");
			System.out.println("5 - Ver prestamos");
			System.out.println("6 - Volver");
			System.out.println("Introduzca un número del 1-6:");

			opcion = scanner.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ha seleccionado añadir prestamo.");
				break;
			case "2":
				System.out.println("Ha seleccionado modificar prestamo.");
				break;
			case "3":
				System.out.println("Ha seleccionado eliminar prestamo.");
				break;
			case "4":
				System.out.println("Ha seleccionado ver prestamo.");
				break;
			case "5":
				System.out.println("Ha seleccionado ver prestamos.");
				break;
			case "6":
				System.out.println("Ha seleccionado volver.");
				opcion = "6";
				break;
			default:
				System.out.println("La opción seleccionada no es válida.");
				break;
			}
		} while (!opcion.equals("6"));
	}

	static class Gestor {
		String nombre;

	}
}
