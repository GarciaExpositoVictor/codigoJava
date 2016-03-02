package GeometriaPK;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		formasGeometricas FG = new formasGeometricas(3);
                
                
		Circulo circulo = new Circulo();
		circulo.setRadio(100);
		System.out.println(circulo.calcularArea());
                FG.aFiguras[0] = circulo;
		
		rectangulo rectangulo = new rectangulo();
		rectangulo.setLadoHorizontal(100);
		rectangulo.setLadoVertical(100);
		System.out.println(rectangulo.calcularArea());
                FG.aFiguras[1] = rectangulo;
                
        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLado(100);
        System.out.println(cuadrado.calcularArea());
        FG.aFiguras[2] = cuadrado;
		
                
		
		
				

	}

}
