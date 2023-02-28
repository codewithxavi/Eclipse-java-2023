
public class MainSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invocación al método suma
		int a = MainSuma.suma(2, 3);
		
		// imprime 5
		System.out.println(a);
		
		// imprime 5
		System.out.println(MainSuma.suma(1, 4));
		
		int b = MainSuma.resta(5, 3);
		
		System.out.println("La resta es = " + b);
		
		double c = Math.random();
		System.out.println(c*10);
		
		// el método min de la clase Math retorna el valor mínimo entre dos números que son pasados por argumentos
		System.out.println(Math.min(5,10));
		
		// el método max de la clase Math retorna el valor máximo entre dos números que son pasados por argumentos
		System.out.println(Math.max(10,20));
		
	}

	public static int suma(int x, int y) {
		return x + y;
	}
	
	public static int resta(int x, int y) {
		return x - y;
	}

}
