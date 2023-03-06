

public class EjerciciosExamenJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ejercicio1();
		// Ejercicio2();
		// Ejercicio3();
		// Ejercicio4();
		// Ejercicio5();
	}

	public static void Ejercicio1() {
		System.out.println("***** Comienzo del ejercicio 1 *****");
		System.out.println("Buenos días");
		System.out.println("8*13");

		int num1 = 8, num2 = 13;
		System.out.println("El resultado de la multiplicacion es=" + num1 * num2);

		System.out.println("***** Fin del ejercicio 1 *****");
	}

	public static void Ejercicio2() {
		System.out.println("***** Comienzo del ejercicio 2 *****");
		int resultado = 1 + 2 + 3;
		System.out.printf("%s %d", "1 + 2 + 3 =", resultado);
		System.out.println("***** Fin del ejercicio 2 *****");
	}

	public static void Ejercicio3() {
		System.out.println("***** Comienzo del ejercicio 3 *****");
		int a = 2, b = 4, c = 6, resultado = a + b + c;
		System.out.println("La suma es: " + (a + b + c));
		c = 8;
		resultado = a + b + c;
		System.out.printf("La suma de %d, %d y %d es: %d", a, b, c, resultado).println();
		;
		System.out.println("***** Fin del ejercicio 3 *****");
	}

	public static void Ejercicio4() {
		System.out.println("***** Comienzo del ejercicio 4 *****");

		int a1 = 120, a2 = 30, a3 = 30, suma = a1 + a2 + a3;

		if (suma == 180) {
			System.out.println("Forman un triángulo.");
		} else {
			System.out.println("No forman un triángulo.");
		}

		System.out.println("***** Fin del ejercicio 4 *****");

	}
	
	public static void Ejercicio5() {
		System.out.println("***** Comienzo del ejercicio 5 *****");
		int n1=20,n2=5,n3=100,n4=500, grande = n1;
        if (n2 > grande) {
            grande = n2;
        }
        if (n3 > grande) {
        	grande = n3;
        }
        if (n4 > grande) {
        	grande = n4;
        }
        
        System.out.println("El grande es = " + grande);
        
        System.out.println("***** Fin del ejercicio 5 *****");
	}


	
	
}
