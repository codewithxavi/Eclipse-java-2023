
public class EjerciciosStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Concateno2StringBuilder();
		// EliminarUltimo();
		//InsertarCadaTres();
		
		//StringBuilder sb = new StringBuilder("este es un ejemplo de texto en minúsculas");
		//System.out.println("Texto original: " + sb);
		//convertirPrimerasLetrasMayuscula(sb);
		//System.out.println("Texto modificado: " + sb);
	}

	// Ejercicio: escribe un programa que concatene dos StringBuilder, utilizando
	// append y también el operador concatenación.
	public static void Concateno2StringBuilder() {
		StringBuilder sb1 = new StringBuilder("Hola ");
		StringBuilder sb2 = new StringBuilder("Adios");

		System.out.println(sb1.append(sb2));
	}

	// Ejercicio: escribe un programa que elimine el último carácter de un
	// StringBuilder.
	public static void EliminarUltimo() {
		StringBuilder sb1 = new StringBuilder("Hola Xavi!");
		sb1.deleteCharAt(sb1.length() - 1);

		System.out.println(sb1);
	}

	// Ejercicio: escribe un programa que inserte el carácter 'b' cada tres
	// posiciones en un StringBuilder.
	public static void InsertarCadaTres() {

		StringBuilder sb1 = new StringBuilder("Hola Xavi que tal estás?");
		for (int i = 3; i < sb1.length(); i += 4) {
			sb1.insert(i, 'b');
		}

		System.out.println(sb1);

	}

	// Ejercicio: escribe un programa que convierta en mayúsculas la primera letra
	// de cada palabra de un StringBuilder.
	public static void convertirPrimerasLetrasMayuscula(StringBuilder sb) {
		boolean capitalize = true;
		for (int i = 0; i < sb.length(); i++) {
			if (Character.isWhitespace(sb.charAt(i))) {
				capitalize = true;
			} else if (capitalize) {
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				capitalize = false;
			}
		}
	}

	// Ejercicio: escribe un programa para invertir cada palabra de un párrafo de un StringBuilder.

}
