
public class rectángulo extends area{
	
	private int ladoHorizontal = 0;
	private int ladoVertical = 0;
	
	public rectángulo(int ladoHorizontal, int ladoVertical){
		this.ladoHorizontal = ladoHorizontal;
		this.ladoVertical = ladoVertical;
	}
	
	public void setLadoHorizontal(int ladoHorizontal){
		this.ladoHorizontal = ladoHorizontal;
	}
	
	public int getLadoHorizontal(){
		return ladoHorizontal;
	}
	
	public void setLadoVertical(int ladoVertical){
		this.ladoVertical = ladoVertical;
	}
	
	public int getLadoVertical(){
		return ladoVertical;
	}
	
	public double areaRectangulo (double area){
		area = this.ladoVertical * this.ladoHorizontal;
		return area;

}
}
