
public class EjerciciosPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Estudiante e = Estudiante.crearEstudiante();
		e.mostrarInfo();
		e.mostrarID();
		
		Profesor p = new Profesor();
		p.mostrarID();
		
		
		
		
		
	}
	
	
	static interface PersonaInterfaz{
		public abstract void mostrarID();

	}
	
	
	static abstract class Persona implements PersonaInterfaz {
		
		protected int id, edad, telefono;
		
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

		public void mostrarInfo() {}

//		@Override
//		public void mostrarID() {
//			// TODO Auto-generated method stub
//			
//		}
//		
		
		
	}
	
	static class Estudiante extends Persona {
		
		public Estudiante(int numeroDeNotas, int sumaDeNotas, int notaMedia) {
			super();
			this.numeroDeNotas = numeroDeNotas;
			this.sumaDeNotas = sumaDeNotas;
			this.notaMedia = notaMedia;
		}
		
		private int numeroDeNotas, sumaDeNotas; 
		float notaMedia;
		
		
		
		public int getNumeroDeNotas() {
			return numeroDeNotas;
		}

		public void setNumeroDeNotas(int numeroDeNotas) {
			this.numeroDeNotas = numeroDeNotas;
		}

		public int getSumaDeNotas() {
			return sumaDeNotas;
		}

		public void setSumaDeNotas(int sumaDeNotas) {
			this.sumaDeNotas = sumaDeNotas;
		}

		public float getNotaMedia() {
			return notaMedia;
		}

		public void setNotaMedia(float notaMedia) {
			this.notaMedia = notaMedia;
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
			return new Estudiante(6, 36, 6);
		}
		
		public void mostrarInfo() {
			System.out.println(this.getNumeroDeNotas() + "+" + this.getSumaDeNotas() + "+" + this.getNotaMedia());
		}

		@Override
		public void mostrarID() {
			// TODO Auto-generated method stub
			System.out.println("ID del estudiante="+this.getId() + " - Nota: " + this.getNotaMedia());
		}
		
		
	}
	
	static class Profesor extends Persona {
		public int getNumeroDeEdadesEstudiantes() {
			return numeroDeEdadesEstudiantes;
		}

		public void setNumeroDeEdadesEstudiantes(int numeroDeEdadesEstudiantes) {
			this.numeroDeEdadesEstudiantes = numeroDeEdadesEstudiantes;
		}

		public int getSumaDeEdadesEstudiantes() {
			return sumaDeEdadesEstudiantes;
		}

		public void setSumaDeEdadesEstudiantes(int sumaDeEdadesEstudiantes) {
			this.sumaDeEdadesEstudiantes = sumaDeEdadesEstudiantes;
		}

		public int getEstudiantesEdadMedia() {
			return estudiantesEdadMedia;
		}

		public void setEstudiantesEdadMedia(int estudiantesEdadMedia) {
			this.estudiantesEdadMedia = estudiantesEdadMedia;
		}

		private int numeroDeEdadesEstudiantes, sumaDeEdadesEstudiantes, estudiantesEdadMedia;
		
		public void agregarEdadEstudiante() {
			this.numeroDeEdadesEstudiantes++;
		}
		
		public void mostrarInfo() {
			System.out.println(this.getNumeroDeEdadesEstudiantes() + "+" + this.getSumaDeEdadesEstudiantes() + "+ " + this.getEstudiantesEdadMedia());
		}


		@Override
		public void mostrarID() {
			// TODO Auto-generated method stub
			System.out.println("Numero medio de estudiantes="+this.getNumeroDeEdadesEstudiantes());
		}
		
		
		
	}
	
	
}
