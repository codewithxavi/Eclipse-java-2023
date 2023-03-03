
public class EjercicioVehiculos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Vehiculo v = new Vehiculo();
		Bicicleta orbea = new Bicicleta(5, true);
		System.out.println(orbea.getCambios());
		orbea.setCambios(23);
		System.out.println(orbea.getCambios());

		// Ejemplo de polimorfismo
		Bicicleta bh = new Bicicleta();
		Coche honda = new Coche();
		Avion boeing = new Avion(true);
		// Vehiculo moto = new Bicicleta();

		invocarParar(bh);
		invocarParar(honda);
		invocarParar(boeing);

		///////////// 1 Instancia //////////////////////
		Coche audi = new Coche();
		audi.setAsientos(2);
		System.out.println(audi.getAsientos());
		CambiarValor(audi);
		System.out.println(audi.getAsientos());

		/////////////  2 Instancias //////////////////////
		
		
	}

	public static void CambiarValor(Coche audi) {
		audi = new Coche();
		// Cambia el valor de los asientos a 2
		audi.setAsientos(4);
	}

	public static void invocarParar(Vehiculo vehiculo) {
		vehiculo.parar();
	}

	static interface Vehiculo {

		// Atributs
		public static final float g = 9.8f;

//		public static final float velocidad = 0;
//		public static final int asientos = 0 ;
//		public static final int orientacionRuedas = 0;

//		public abstract void parar();

		// public void parar() {
		// System.out.println("Metodo del vehiculo");
		// }

		public abstract void parar();

		public abstract void acelerar();

		public abstract void desacelerar();

		public abstract void girarIzquierda();

		public abstract void girarDerecha();

	}

	static class Coche implements Vehiculo {

		// Atributos
		private float caballos;
		public static final float factorConversionCvKw = 1.35f;
		private int asientos;

		// Metodos
//		public void desacelerar(float incrementoVelocidad) {
//			this.velocidad -= incrementoVelocidad;
//		}
//
//		public void desacelerar(boolean marchaAtras) {
//			if (marchaAtras)
//				this.velocidad = -.5f;
//
//		}
//
//		public void acelerar(float incrementoVelocidad) {
//			this.velocidad += incrementoVelocidad;
//		}
//
//		public Coche() {
//			this.velocidad = 100.0f;
//			this.caballos = 150.0f;
//			this.asientos = 5;
//			this.orientacionRuedas = 2;
//		}

//		public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
//			this.velocidad = velocidad;
//			this.caballos = caballos;
//			this.asientos = asientos;
//			this.orientacionRuedas = orientacionRuedas;
//		}
//
//		public float getVelocidad() {
//			return velocidad;
//		}
//
//		public void setVelocidad(float velocidad) {
//			this.velocidad = velocidad;
//		}

		public float getCaballos() {
			return caballos;
		}

		public void setCaballos(float caballos) {
			this.caballos = caballos;
		}

		public int getAsientos() {
			return asientos;
		}

		public void setAsientos(int asientos) {
			this.asientos = asientos;
		}
//
//		public int getOrientacionRuedas() {
//			return orientacionRuedas;
//		}
//
//		public void setOrientacionRuedas(int orientacionRuedas) {
//			this.orientacionRuedas = orientacionRuedas;
//		}

		// Métodos

		public static float convertirCvKw(float caballos) {
			return caballos / 1.35f;
		}

		public static float convertirKwCv(float kilowatios) {
			return kilowatios / 1.35f;
		}

		@Override
		public void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo de vehiculo");
		}

		@Override
		public void acelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void desacelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarIzquierda() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarDerecha() {
			// TODO Auto-generated method stub

		}

	}

	static class Avion implements Vehiculo {
		// Atributos
		private boolean trenAterrizaje;

		public Avion(boolean trenAterrizaje) {
			this.trenAterrizaje = trenAterrizaje;
		}

		public boolean isTrenAterrizaje() {
			return trenAterrizaje;
		}

		public void setTrenAterrizaje(boolean trenAterrizaje) {
			this.trenAterrizaje = trenAterrizaje;
		}

		// Métodos
		public void volar() {
			System.out.println("VOLANDOOOOOOOOOOO...");
		}

		public void aterrizar() {
			System.out.println("At...");
		}

		@Override
		public void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo del avion");
		}

		@Override
		public void acelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void desacelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarIzquierda() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarDerecha() {
			// TODO Auto-generated method stub

		}

	}

	static class Bicicleta implements Vehiculo {

		public Bicicleta() {
			this.cambios = 8;
		}

		// Constructor
		public Bicicleta(int cambios, boolean timbre) {
			this.cambios = cambios;
			this.timbre = timbre;
		}

		// Atributos
		protected int cambios;
		protected boolean timbre;

		// Gets y sets
		public int getCambios() {
			return cambios;
		}

		public void setCambios(int cambios) {
			this.cambios = cambios;
		}

		public boolean isTimbre() {
			return timbre;
		}

		public void setTimbre(boolean timbre) {
			this.timbre = timbre;
		}

		public void hacerCaballito() {
			System.out.println("Haciendo caballito... !!!");
		}

		@Override
		public void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo de la bicicleta");
		}

		@Override
		public void acelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void desacelerar() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarIzquierda() {
			// TODO Auto-generated method stub

		}

		@Override
		public void girarDerecha() {
			// TODO Auto-generated method stub

		}

	}

	static class Boeing707 extends Avion {

		public Boeing707(boolean trenAterrizaje) {
			super(trenAterrizaje);

		}

		protected boolean caducado = true;

	}

}
