
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
		
		

		
	}
	
	public static void invocarParar(Vehiculo vehiculo) {
		vehiculo.parar();
	}
	
	static abstract class Vehiculo{
		public Vehiculo() {}
		protected float velocidad;
		protected int asientos;
		protected int orientacionRuedas;
		
		protected abstract void parar();
		
		//		public void parar() {
		//			System.out.println("Metodo del vehiculo");
		//		}
		public void acelerar() {}
		public void desacelerar() {}
		public void girarIzquierda() {}
		public void girarDerecha() {}

		
	}
	
	static class Coche extends Vehiculo {
		
		public Coche(float caballos) {
			super();
			this.caballos = 200.0f;
		}
		
		
		

		// Atributos 
		private float caballos;
		public static final float factorConversionCvKw = 1.35f;

		// Metodos
		public void desacelerar(float incrementoVelocidad) {
			this.velocidad -= incrementoVelocidad;
		}

		public void desacelerar(boolean marchaAtras) {
			if (marchaAtras)
				this.velocidad = -.5f;

		}

		public void acelerar(float incrementoVelocidad) {
			this.velocidad += incrementoVelocidad;
		}

		public Coche() {
			this.velocidad = 100.0f;
			this.caballos = 150.0f;
			this.asientos = 5;
			this.orientacionRuedas = 2;
		}

		public Coche(float velocidad, float caballos, int asientos, int orientacionRuedas) {
			this.velocidad = velocidad;
			this.caballos = caballos;
			this.asientos = asientos;
			this.orientacionRuedas = orientacionRuedas;
		}

		public float getVelocidad() {
			return velocidad;
		}

		public void setVelocidad(float velocidad) {
			this.velocidad = velocidad;
		}

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

		public int getOrientacionRuedas() {
			return orientacionRuedas;
		}

		public void setOrientacionRuedas(int orientacionRuedas) {
			this.orientacionRuedas = orientacionRuedas;
		}

		
		
		// Métodos

		public static float convertirCvKw(float caballos) {
			return caballos / 1.35f;
		}

		public static float convertirKwCv(float kilowatios) {
			return kilowatios / 1.35f;
		}

		@Override
		protected void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo de vehiculo");
		}

	}
	
	static class Avion extends Vehiculo {
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
		protected void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo del avion");
		}
		
		
	}
	
	static class Bicicleta extends Vehiculo{
		
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
		protected void parar() {
			// TODO Auto-generated method stub
			System.out.println("Metodo de la bicicleta");
		}
		
		
	}

	static class Boeing707 extends Avion{

		public Boeing707(boolean trenAterrizaje) {
			super(trenAterrizaje);
			
		}
		
		protected boolean caducado = true;
		
	}
	
}
