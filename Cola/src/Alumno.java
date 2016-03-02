
public class Alumno implements Comparable<Object> {
	String Nombre;
	String Apellido;
	int prioridad;
	
	public Alumno(String nombre, String apellido, int prioridad) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.prioridad = prioridad;
	}
	
	@Override
	public int compareTo(Object Alumno) {
		Alumno alumno = (Alumno) Alumno;
		if((prioridad)> alumno.prioridad) {
            return 1;
		} else if(prioridad < alumno.prioridad){
            return -1;
        }
        return 0;
        
	}

}
