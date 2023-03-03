
public class EjercicioFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo(4,6);
		r1.dibujar();
		System.out.println("El area del rectangulo es=" + r1.getAltura() * r1.getBase());
		
		Circulo c = new Circulo(5);
		c.dibujar();
		System.out.println("El area del circulo es=" + c.area());
		
	}

	static interface Dibujable {
		// atributos constantes
		public static float pi = 3.14159f;
		
		public abstract void dibujar();
	}

	// Superclase de circulo y rectangulo
	static abstract class Figura {
		// Metodo
		public abstract float area();
	}

	static class Circulo extends Figura implements Dibujable {

		// Constructores
		public Circulo() {
			super();
		}
		
		public Circulo(float r) {
			super();
			this.r = r;
		}
		
		// GETTERS y SETTERS
		public float getR() {
			return r;
		}

		public void setR(float r) {
			this.r = r;
		}


		// Atributos
		protected float r = 5;
		@Override
		public void dibujar() {
			// TODO Auto-generated method stub
			System.out.println("Dibujando el círculo!");
		}

		@Override
		public float area() {
			// TODO Auto-generated method stub
//			return pi*r*2;
			return (float) (pi * Math.pow(r, 2));
			
		}

	}

	static class Rectangulo extends Figura implements Dibujable {

		public Rectangulo(int base) {
			super();
			this.base = base;
		}

		public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		public int getAltura() {
			return altura;
		}

		public void setAltura(int altura) {
			this.altura = altura;
		}

		public Rectangulo() {
			super();
		}

		public Rectangulo(int base, int altura) {
			super();
			this.base = base;
			this.altura = altura;
		}

		// Atributos
		private int base;
		private int altura;
		
		@Override
		public void dibujar() {
			// TODO Auto-generated method stub
			System.out.println("Dibujo del rectangulo");
		}

		@Override
		public float area() {
			// TODO Auto-generated method stub
			return base * altura;
		}

	}

}
