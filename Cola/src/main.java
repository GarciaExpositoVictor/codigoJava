
public class main {

	public static void main(String[] args){ 
		
	        ColaErasmus cola = new ColaErasmus();
	        cola.incluirAlumno(new Alumno("Jose", "Heredia", 1));
	        cola.incluirAlumno(new Alumno("Paco", "Pico", 2));
	        cola.incluirAlumno(new Alumno("Pico", "Peco", 4));
	        cola.incluirAlumno(new Alumno("a", "d", 8));
	        
	        System.out.println("Esta es la cola de alumnos" + cola.mostarCola());
	        
	        System.out.println("Los alumnos en cola son" + cola.contarAlumnos());
	        
	        System.out.println("Se va a eliminar al primer alumno " + cola.remove(A));
	        
	        System.out.println("Vamos a colar al alumno 3");
	        
	        cola.colar(alumno);
	}

}
