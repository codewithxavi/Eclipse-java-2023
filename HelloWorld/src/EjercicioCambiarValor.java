
public class EjercicioCambiarValor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valor1 = 5;
		CambiarValor(valor1);
		
		System.out.println(valor1);
	}
	
	public static void CambiarValor(int valor1) {
		valor1 = 6;
		
		// 6
		System.out.println("Desde dentro=" + valor1);
	}

}
