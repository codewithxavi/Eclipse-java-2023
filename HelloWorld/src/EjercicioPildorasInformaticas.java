import java.util.Arrays;

public class EjercicioPildorasInformaticas {

	public static void main(String[] args) {
		int[] resultado = obtenerMultiplos(3, 5);
		System.out.println(Arrays.toString(resultado)); 

	}

	public static int[] obtenerMultiplos(int numero, int elementos) {
		int[] multiplos = new int[elementos];
		int i = 0;
		int j = 1;
		while (i < elementos) {
			if (j % numero == 0) {
				multiplos[i] = j;
				i++;
			}
			j++;
		}
		return multiplos;
	}

}
