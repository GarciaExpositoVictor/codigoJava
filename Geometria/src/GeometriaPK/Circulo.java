package GeometriaPK;
import java.lang.Math;

public class Circulo extends Figura{
	
	private int radio = 0;
	
	
	public void Circulo (int radio, double pi){
		this.radio = radio;
	}
	
	public void setRadio(int radio){
		this.radio = radio;
	}
	
	public int getRadio(){
		return radio;
	}
	
	public double getPi(){
		return Math.PI;
	}
	
        @Override
	public double calcularArea (){
		double cuadradoRadio = this.getRadio() * this.getRadio();
		return Math.PI * cuadradoRadio;
				
	}


}
