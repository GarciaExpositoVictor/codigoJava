package appalma;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	/*creamos un array de bicicletas que se llama anclajes para poder almacenar 
	las bicicletas*/
	private Bicicleta[] anclajes;
	
	public Estacion(){};
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		/*inicializamos la clase anclajes como un array de bicicletas del tamaño
		 de anclajes que tenga la estación*/
		this.anclajes = new Bicicleta[numeroAnclajes];
	}
	
	
	
}
