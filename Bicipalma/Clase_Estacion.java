package appalma;
import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
	private int id = 0;
	private String direccion = null;
	private int numeroAnclajes = 0;
	private Bicicleta[] anclajes;
	
	public Estacion(int id, String direccion, int numeroAnclajes){
		this.id = id;
		this.direccion = direccion;
		this.numeroAnclajes = numeroAnclajes;
		this.anclajes = new Bicicleta[numeroAnclajes];
	}
	
	public void consultarEstacion(){
		System.out.println("Id: " + this.id);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Numero de anclajes: " + this.numeroAnclajes);
	}
	
	public int anclajesLibres(){
		int contadorAnclajes = 0;
		for(int i = 0; i < this.anclajes.length; i++){
			if (this.anclajes[i] == null){
				contadorAnclajes++;
			}
		}
		return contadorAnclajes;
	}
	
	public void consultarAnclajes(){
		for (int i = 0; i < this.anclajes.length; i++){
			if (this.anclajes[i] == null){
				System.out.println("Anclaje " + i + " esta libre");
			}else{
				System.out.println("Bicicleta " + anclajes[i].getId());
			}
		}
	}
	
	public void anclarBicicleta(Bicicleta bicicleta){
		int numeroAnclaje = 0;
		for (int i = 0; i < this.anclajes.length; i++){
			if (this.anclajes[i] == null){
				this.anclajes[i] = bicicleta;
				numeroAnclaje = i;
				break;
			}
		}
		
		this.mostrarAnclaje(bicicleta, numeroAnclaje);
	}
	
	public void mostrarAnclaje(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("Id bicicleta anclada: " + bicicleta.getId());
		System.out.println("Numero de anclaje: " + numeroAnclaje);
	}
	
	public Boolean leerTarjetaUsuario(TarjetaUsuario tarjetaUsuario){
		return tarjetaUsuario.getActivada();
	}
	
	public void retirarBicicleta(TarjetaUsuario tarjetaUsuario){
		if (this.leerTarjetaUsuario(tarjetaUsuario)){
			int anclaje = generarAnclaje(); //Anclaje aleatorio
			if (this.anclajes[anclaje] != null){
				this.mostrarBicicleta(this.anclajes[anclaje], anclaje);
				this.anclajes[anclaje] = null;
			}
		}
	}
	
	public void mostrarBicicleta(Bicicleta bicicleta, int numeroAnclaje){
		System.out.println("Id bicicleta: " + bicicleta.getId());
		System.out.println("Numero de anclaje donde estaba: " + numeroAnclaje);
	}
	
	public int generarAnclaje(){
		return ThreadLocalRandom.current().nextInt(0, this.anclajes.length);
	}
}