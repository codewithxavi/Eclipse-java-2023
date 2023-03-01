
public class Ejercicio370 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante e1 = new Estudiante(1, 26, 66666666, 5, 12, 2);
		Coche c = new Coche();

		System.out.println(c.getVelocidad());
		System.out.println(c.convertirCvKw(200.0f));

		float kw = c.convertirCvKw(200.0f);
		System.out.printf("%f Kw", kw).println();

		float cv = c.convertirKwCv(kw);
		System.out.printf("%f Cv", cv).println();

		// c.factorConversionCvKw = 2.35f; Ya no podemos modificarlo pq tiene el final

		Estudiante e2 = Estudiante.crearEstudiante();

		Coche c2 = new Coche(100.0f, 150.0f, 7, 4);
		System.out.println(c2.getVelocidad());
		c2.acelerar();
		System.out.println(c2.getVelocidad());
		c2.desacelerar();
		System.out.println(c2.getVelocidad());
		c2.desacelerar(20.0f);
		System.out.println(c2.getVelocidad());
		c2.desacelerar(true);
		System.out.println(c2.getVelocidad());

		Estudiante jesus = new Estudiante(4);
		System.out.println(jesus.getEdad());
		System.out.println(jesus.getNumeroDeNotas());
		System.out.println(jesus.getSumaDeNotas());
		System.out.println(jesus.getNotaMedia());
		jesus.agregarNuevaNota();
		System.out.println(jesus.getNumeroDeNotas());
		System.out.println(jesus.getSumaDeNotas());
		System.out.println(jesus.getNotaMedia());
		System.out.println("" + "Agregado nueva nota con valor 10 " + "como argumento");
		jesus.agregarNuevaNota(10.0f);
		System.out.println(jesus.getNumeroDeNotas());
		System.out.println(jesus.getSumaDeNotas());
		System.out.println(jesus.getNotaMedia());
		
		System.out.println("Agregando boolean true reiniciaos");
		jesus.agregarNuevaNota(10.0f, true);
		System.out.println(jesus.getNumeroDeNotas());
		System.out.println(jesus.getSumaDeNotas());
		System.out.println(jesus.getNotaMedia());

	}

	static class Estudiante {

		private int id = 1;
		private int edad = 26;
		private int telefono;
		private int numeroDeNotas = 5;
		private float sumaDeNotas;
		private float notaMedia;

		public Estudiante() {
			this.id = 1;
			this.edad = 36;
			this.telefono = 666666666;
			this.numeroDeNotas = 6;
			this.sumaDeNotas = 36;
			this.notaMedia = sumaDeNotas / numeroDeNotas;

		}

		public Estudiante(int id) {
			this.id = id;
			this.edad = 36;
			this.telefono = 666666666;
			this.numeroDeNotas = 6;
			this.sumaDeNotas = 36;
			this.notaMedia = sumaDeNotas / numeroDeNotas;

		}

		public Estudiante(int id, int edad) {
			this.id = id;
			this.edad = edad;
			this.telefono = 666666666;
			this.numeroDeNotas = 6;
			this.sumaDeNotas = 36;
			this.notaMedia = sumaDeNotas / numeroDeNotas;

		}

		public Estudiante(int id, int edad, int telefono, int numeroDeNotas, float sumaDeNotas, float notaMedia) {
			this.id = id;
			this.edad = edad;
			this.telefono = telefono;
			this.numeroDeNotas = numeroDeNotas;
			this.sumaDeNotas = sumaDeNotas;
			this.notaMedia = notaMedia;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public int getTelefono() {
			return telefono;
		}

		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}

		public int getNumeroDeNotas() {
			return numeroDeNotas;
		}

		public void setNumeroDeNotas(int numeroDeNotas) {
			this.numeroDeNotas = numeroDeNotas;
		}

		public float getSumaDeNotas() {
			return sumaDeNotas;
		}

		public void setSumaDeNotas(int sumaDeNotas) {
			this.sumaDeNotas = sumaDeNotas;
		}

		public double getNotaMedia() {
			return sumaDeNotas / numeroDeNotas;
		}

		public void setNotaMedia(float notaMedia) {
			this.notaMedia = notaMedia;
		}

		public void mostrarInfo() {

		}

		public void agregarNuevaNota() {
			this.numeroDeNotas++;
			this.sumaDeNotas += notaMedia;
		}

		public void agregarNuevaNota(float nuevaNota) {
			this.numeroDeNotas++;
			this.sumaDeNotas += nuevaNota;

		}

		public void agregarNuevaNota(float nuevaNota, boolean reinicio) {
			if(reinicio) {
				this.numeroDeNotas = 0;
				this.sumaDeNotas = 0;
				this.notaMedia = 0.0f;
			} else {
				agregarNuevaNota();
			}
		}

		public static Estudiante crearEstudiante() {
			return new Estudiante();
		}

	}

	static class Coche {
		private float velocidad;
		private float caballos;
		private int asientos;
		private int orientacionRuedas;
		public static final float factorConversionCvKw = 1.35f;

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

		void parar() {
		}

		void acelerar() {
		}

		void desacelerar() {
		}

		void girarIzquierda() {
		}

		void girarDerecha() {
		}

		public static float convertirCvKw(float caballos) {
			return caballos / 1.35f;
		}

		public static float convertirKwCv(float kilowatios) {
			return kilowatios / 1.35f;
		}

	}
}
