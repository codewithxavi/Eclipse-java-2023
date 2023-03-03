public class EjercicioPalabraString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "";
		String palabra = "Marc";
		boolean bool = true;
		for (int i = 0; i < palabra.length(); i++) {
			cadena += palabra.charAt(i);
			
		}
		
		System.out.println(cadena);
		System.out.printf("%b", bool);
	}

}


