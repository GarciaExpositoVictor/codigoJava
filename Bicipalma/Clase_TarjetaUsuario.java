package appalma;

public class TarjetaUsuario {
	private String id = "123456789";
	private Boolean activada = false;
	
	public TarjetaUsuario(String id, Boolean activada){
		this.id = id;
		this.activada = activada;
	}
	
	public Boolean getActivada(){
		return this.activada;
	}
}