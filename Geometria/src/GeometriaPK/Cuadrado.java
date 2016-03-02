package GeometriaPK;


public class Cuadrado extends Figura {
	
	private int lado = 0;
	
	public Cuadrado(){
	}
	
	public void setLado(int lado){
		this.lado = lado;
	}
	
	public int getLado(){
		return lado;
	}
	
        @Override
	public double calcularArea (){
                return this.lado*this.lado;
	}

	
}
