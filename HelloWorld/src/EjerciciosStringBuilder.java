
public class EjerciciosStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Concateno2StringBuilder();
		// EliminarUltimo();
		InsertarCadaTres();
		GeneraMayuscula();
	}

	
	
	//Ejercicio: escribe un programa que concatene dos StringBuilder, utilizando append y también el operador concatenación.
	public static void Concateno2StringBuilder() {
		StringBuilder sb1 = new StringBuilder("Hola ");
		StringBuilder sb2 = new StringBuilder("Adios");

		System.out.println(sb1.append(sb2));
	}
	
	//Ejercicio: escribe un programa que elimine el último carácter de un StringBuilder.
	public static void EliminarUltimo() {
		StringBuilder sb1 = new StringBuilder("Hola Xavi!");
		sb1.deleteCharAt(sb1.length()-1);
		
		System.out.println(sb1);
	}
	
	//Ejercicio: escribe un programa que inserte el carácter 'b' cada tres posiciones en un StringBuilder.
	public static void InsertarCadaTres() {

		StringBuilder sb1 = new StringBuilder("Hola Xavi que tal estás?");
        for (int i=3; i<sb1.length(); i += 4) {
        	sb1.insert(i, 'b');
        }
       
   
        System.out.println(sb1);
		
		
	}
	
	//Ejercicio: escribe un programa que convierta en mayúsculas la primera letra de cada palabra de un StringBuilder.
	public static void GeneraMayuscula(){
		StringBuilder sb = new StringBuilder("Hola xavi que tal estás?");
		char espacio = ' ';
		
		
		for(int i=0; i < sb.length(); i++) {
			System.out.print(sb.charAt(i));
			if (sb.charAt(i) == espacio ) {
				
			}
		}
		
	}
	
	//Ejercicio: escribe un programa para invertir cada palabra de un párrafo de un StringBuilder.
	
}
