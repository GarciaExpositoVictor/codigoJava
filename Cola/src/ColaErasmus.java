import java.util.TreeSet;

public class ColaErasmus{
	TreeSet<Alumno> ColaErasmus;
	
	public ColaErasmus(){
		new TreeSet<Alumno>(); 
	}
	
	public void incluirAlumno(Alumno alumno){
		ColaErasmus.add(alumno);
	}
	
	public void vaciar(){
		ColaErasmus.clear();
	}
	
	public void mostarCola(){
		for(Alumno alumno : ColaErasmus){
			System.out.println(alumno);
		}
	}
	
	public int contarAlumnos(){
		return ColaErasmus.size();
	}
	
	public void eliminarAlumno(Alumno alumno){
		ColaErasmus.remove(alumno);
	}
	
	public void eliminarDesdePrincipio(){
		while (ColaErasmus.size() > 0) {            
            System.out.println(ColaErasmus.pollLast());
        }
    }
    
    public void colar(Alumno alumno){
        ColaErasmus.remove(alumno);
        alumno.prioridad = Integer.MAX_VALUE;
        ColaErasmus.add(alumno);
    }
}
