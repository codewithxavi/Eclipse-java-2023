import java.util.Random;

public class EjercicioAarrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimerArray();
	}
	
//	Ejercicio: escribe un programa que genere un array de 6 valores de tipo int y sean mostrados en pantalla utilizando un bucle for.
	public static void PrimerArray() {
		 int arreglo[] = new int[6];
        Random aleatorio = new Random();
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = aleatorio.nextInt(10);
            System.out.println(arreglo[i]);
        }
        
    
	}

}
