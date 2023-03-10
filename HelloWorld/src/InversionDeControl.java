
public class InversionDeControl {

	// MainSpring.java
	public class Main {
		public static void main(String[] args) {
			Entrenador entrenadorFutbol = new EntrenadorFutbol();
			Entrenador entrenadorBaloncesto = new EntrenadorBaloncesto();
			System.out.println(entrenadorFutbol.getEntrenamiento());
			System.out.println(entrenadorBaloncesto.getEntrenamiento());
		}
	}

	// Entrenador.java
	public interface Entrenador {
		public abstract String getEntrenamiento();
	}

	// EntrenadorFutbol.java
	static class EntrenadorFutbol implements Entrenador {
		@Override
		public String getEntrenamiento() {
			return "Correr durante 30 minutos";
		}	
	}

	// EntrenadorBaloncesto.java
	static class EntrenadorBaloncesto implements Entrenador {
		@Override
		public String getEntrenamiento() {
			return "Lanzar 30 tiros a canasta";
		}
	}

}
