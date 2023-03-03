public class EjerciciosStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ComprobarCaracteres();
		// ComprobarDosPrimerosDosUltimos();
		// ComprobarABC();
		// CaracterAnteriorPosterior();
		// OcurrenciaCaracterA();
		Palindromo();
		
	}

	public static void ComprobarCaracteres() {
		String cadena1 = "Javi";
		String cadena2 = "Xavi";

		char letraCadena1 = cadena1.charAt(0);
		char letraCadena2 = cadena2.charAt(0);

		if (letraCadena1 == letraCadena2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
	}

	public static void ComprobarDosPrimerosDosUltimos() {
		String cadena1 = "Javi";
		String cadena2 = "Javi";

		String principio1 = cadena1.substring(0, 2);
		String principio2 = cadena2.substring(0, 2);

		String final1 = cadena1.substring(cadena1.length() - 2);
		String final2 = cadena2.substring(cadena2.length() - 2);

		if (principio1.equals(principio2) && final1.equals(final2)) {
			System.out.println("Son iguals");
		} else {
			System.out.println("No son iguals");
		}

	}

//	Ejercicio: escribe un programa que compruebe que el substring "abc" se encuentra en un
//	String dado, pero no puede encontrarse ni al comienzo, ni al final.
	public static void ComprobarABC() {
		String cadena = "dlksadalksdslk  ksakjsakjdsaab";
		if (cadena.startsWith("abc"))
			return;
		if (cadena.endsWith("abc"))
			return;
		if (cadena.contains("abc")) {
			System.out.println("3 -- La paraula donada conté adins abc");
		}
	}

//	Ejercicio: escribe un programa que dado un String y un determinado índice, compruebe que el carácter anterior y el posterior son iguales o no.
	public static void CaracterAnteriorPosterior() {
		String cadena = "Holo Xavi que tal estás?";
		int indice = 2;

		char anterior = cadena.charAt(indice - 1);
		char siguiente = cadena.charAt(indice + 1);

		if (anterior == siguiente)
			System.out.println("Son iguales");
		else
			System.out.println("No Son iguales");

	}

//	Ejercicio: escribe un programa que muestra por pantalla el índice de la segunda y tercera ocurrencia del carácter 'a' en un String dado.
	public static void OcurrenciaCaracterA() {
		String cadena = "Hola Xavi que tal estás?";
		char letra = 'a';
		int cuentaLetra = 1;

		for (int i=0; i<cadena.length(); i++) {
		    if(cadena.charAt(i) == letra) {
		        if (cuentaLetra == 2) {
		            System.out.println(i);
		        }
		        if (cuentaLetra == 3) {
		            System.out.println(i);
		        }
		        cuentaLetra++;
		    }
		}
		
		
		
	}

	public static void Palindromo() {
		String palindromo = "aibofobia";
		String inverso = "";
		
		for (int i=palindromo.length()-1; i >= 0; i--){
			inverso += palindromo.charAt(i);
		}
		
		if (palindromo.equals(inverso)) System.out.println("Es palindromo");
		else System.out.println("No Es palindromo");
	}
	
}
