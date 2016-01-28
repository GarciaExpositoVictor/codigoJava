
public class Círculo extends area{
	
	private int radio = 0;
	private double pi = 3.14;
	
	
	public void Circulo (int radio, double pi){
		this.radio = radio;
		this.pi = pi;
	}
	
	public void setRadio(int radio){
		this.radio = radio;
	}
	
	public int getRadio(){
		return radio;
	}
	
	public void setPi(double pi){
		this.pi = pi;
	}
	
	public double getPi(){
		return pi;
	}
	
	public double areaCirculo (){
		
		double cuadradoRadio = this.getRadio() * this.getRadio();
		return this.getPi() * cuadradoRadio;
				
	}

}
