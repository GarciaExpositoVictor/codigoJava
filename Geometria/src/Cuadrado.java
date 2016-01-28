
public class Cuadrado extends area {
	
	private int lado = 0;
	
	public Cuadrado(int lado){
		this.lado = lado;
	}
	
	public void setLado(int lado){
		this.lado = lado;
	}
	
	public int getLado(){
		return lado;
	}
	
	public void areaCuadrado (double area){
		area = this.lado*this.lado;
	}
	
}
