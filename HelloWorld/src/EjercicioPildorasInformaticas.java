import java.util.Arrays;

public class EjercicioPildorasInformaticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] resultado = obtenerMultiplos(3, 5);
		System.out.println(Arrays.toString(resultado)); // [3, 6, 9, 12, 15]

	}

	public static int[] obtenerMultiplos(int numero, int elementos) {
		int[] multiplos = new int[elementos];
		int i = 0; // control de la cantidad de elementos del array 
		int j = 1; // buscar múltiplos del número recibidos
		while (i < elementos) {
			if (j % numero == 0) {
				j = multiplos[i];
				i++;
			}
			j++;
		}
		return multiplos;
	}

}
