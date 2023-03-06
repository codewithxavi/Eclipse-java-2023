import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 11
		System.out.println(suma(1, 3, 3, 4));

		int numeros[] = { 24, 4, 23, 55, 34, 33 };
		// [24, 4, 23, 55, 34, 33]
		System.out.println(Arrays.toString(numeros));
		
		sort();
		

	}

	static int suma(int... numeros) {
		int value = 0;
		for (int numero : numeros) {
			value += numero;
		}
		return value;
	}

	static void fill() {

		int[] numeros = new int[5];
		// cambia todos los valores del array a 100
		Arrays.fill(numeros, 100);
	}

	static void equals() {
		int[] numeros1 = { 1, 2, 3, 4, 5 };
		int[] numeros2 = { 1, 2, 3, 4, 5 };

		// true
		System.out.println(Arrays.equals(numeros1, numeros2));
	}

	static void sort() {
		int[] numeros = { 11, 22, 3, 4, 5, 0 };
		Arrays.sort(numeros);
		// [0, 3, 4, 5, 11, 22]
		System.out.println(Arrays.toString(numeros));
		char[] caracteres = { 'c', 'b', 'a', 'A', 'C' };
		Arrays.sort(caracteres);
		// [A, C, a, b, c]
		System.out.println(Arrays.toString(caracteres));
	}

	
	
}
