
public class BreakSentencies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		while (true) {
			a++;
			if (a == 600000) {
				break;
			}

		}
		System.out.println("finalizado");

		System.out.println(ObtenerPrimo(2));
		
		GenerarExcepcion();
	}

	public static boolean ObtenerPrimo(int numero) {
		int n = numero;

		if (n <= 1)
			return false;

		else if (n == 2)
			return true;

		else {
			for (int i = 2; i < n; i++) {
				if (n % 2 == 0) {
					return false;
				}
			}
			return true;
		}
	}

	public static void GenerarExcepcion() {
		// se generación una excepción porque en la sexta iteración del bucle se realiza
		// la
//		operación matemática 5/0 (infinito) y ese valor no puede ser almacenado en una
//		variable de tipo int. Se arroja una excepción de tipo ArithmeticException y el programa
//		se detiene en ese punto
		for (int i = -5; i < 5; i++) {
			int c = 5 / i;
			System.out.println(c);
		}
		/*
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * Main.main(Main.java:9)
		 */
	}
}
