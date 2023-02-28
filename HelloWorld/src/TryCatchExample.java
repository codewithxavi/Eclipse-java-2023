
public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TryCatchExample();
		// TryCatchExample2();
		// TryCatchFinally();
		StackTrace();
	}

	public static void TryCatchExample() {
		// trata de ejecutar el código que se encuentra entre las llaves
		try {
			for (int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura la excepción de tipo ArithmeticException
//		catch (ArithmeticException e) {
//			System.out.println("Excepción arimética");
//		}
		// captura cualquier otra excepción que pueda producirse
		catch (Exception e) {
			System.out.println("Otro error desconocido");
		}
		System.out.println("El programa continua");
	}

	public static void TryCatchExample2() {
		// trata de ejecutar el código que se encuentra entre las llaves
		try {
			for (int i = -5; i < 5; i++) {
				if (i == 0) {
					throw new ArithmeticException();
				}
				int c = 5 / i;
				System.out.println(c);
			}
		} catch (ArithmeticException e) {
			System.out.println("Excepción aritmética");
		}
	}

	public static void TryCatchFinally() {
		try {
			for (int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}

		catch (Exception e) {
			System.out.println(5 / 0);
		}

		finally {
			System.out.println("Este código se ejecuta siempre");
		}

		System.out.println("Programa finalizado");
	}

	public static void StackTrace() {
		try {
			for (int i = -5; i < 5; i++) {
				int c = 5 / i;
				System.out.println(c);
			}
		}
		// captura cualquier excepción que pueda producirse
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Programa finalizado");
	}
}
