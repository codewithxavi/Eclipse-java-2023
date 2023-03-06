public class Ejercicio6ExamenAnimales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colibri c1 = new Colibri();
		Colibri c2 = new Colibri();
		Colibri c3 = new Colibri();
		
		Delfin d1 = new Delfin();
		Delfin d2 = new Delfin();
		Delfin d3 = new Delfin();
		
		Leopardo l1 = new Leopardo();
		Leopardo l2 = new Leopardo();
		Leopardo l3 = new Leopardo();
		
		c1.setColor("Rojo");
		c1.setPeso(10);
		System.out.println(c1.toString());
		
		d1.setEdad(5);
		d1.setPensar(true);
		System.out.println(d1.toString());

		l1.setPeso(80);
		l1.setVelocidad(120);
		System.out.println(l1.toString());
		
		
	}

	static abstract class Animales {

	
	}

	static interface SeresVivos {

		public static final String nombreCientifico = "";

		public abstract void nacer();

	}

	static class Colibri extends Animales {

		String color = "negro";
		int peso;

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public static void volar() {
			System.out.println("El colibri vuela");
		}

		public static void comer(int nectar) {
			System.out.println("El colibri come " + nectar + "g de nectar");
		}
		
		@Override
		public String toString() {
			return "Colibri [color=" + color + ", peso=" + peso + "]";
		}
		
		
	}

	static class Delfin extends Animales {

		boolean pensar = true;
		int edad;

		public boolean isPensar() {
			return pensar;
		}

		public void setPensar(boolean pensar) {
			this.pensar = pensar;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public static void nadar() {
			System.out.println("El delfin comienza a nadar!!!");
		}

		public static void clickear() {
			System.out.println("El delfín está clickeando 🐬🐬");
		}
		
		@Override
		public String toString() {
			return "Delfin [pensar=" + pensar + ", edad=" + edad + "]";
		}
	}

	static class Leopardo extends Animales {

		int peso;
		double velocidad;

		public int getPeso() {
			return peso;
		}

		public void setPeso(int peso) {
			this.peso = peso;
		}

		public double getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(double velocidad) {
			this.velocidad = velocidad;
		}

		public static void cazar() {
			System.out.println("El Leopardo se lanza a la caza");
		}

		public static void correr() {
			System.out.println("El Leopardo esta corriendo");
		}
		
		@Override
		public String toString() {
			return "Leopardo [peso=" + peso + ", velocidad=" + velocidad + "]";
		}
	}

}
