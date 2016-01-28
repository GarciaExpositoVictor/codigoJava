package TablaAsignacion;

public class main {
	public static void main(String[]args){
		ValidadorDNI testDNI = new ValidadorDNI();
		ValidadorNIE testNIE = new ValidadorNIE();
		
		String[] listaDNICorrecto = {
				"78484464T","72376173A","01817200Q","95882054E","63587725Q",
				"26861694V","21616083Q","26868974Y","40135330P","89044648X"
				};
		
		String[] listaDNIIncorrecto = {
				"78484464O","72376173Ñ","01817200f","958820"   ,"sa3587725",
				"26861694I","21616083a","268689747","4013533sg","X89044648"
				};
		
		String[] listaNIECorrecto = {
				"Y7844464T","Z2376173A","Y1817200Q","Y5882054E","X3587725Q",
				"X2661694V","Z1616083Q","X6868974Y","Z0135330P","X9044648X"
				};
		
		String[] listaNIEIncorrecto = {
				"78484464T","Y2376173d","X1817200e","wa588205e","635877Q",
				"D6861694V","H1616083Q","y6868974Y","4013533",  "z9044689"
				};
		
		int contadorDNI = 1;
		int contadorNIE = 1;
		for (int i=0; i < listaDNICorrecto.length; i++){
			if (testDNI.CheckDNI(listaDNICorrecto[i]) == true){
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNICorrecto[i] + " es correcto");
				contadorDNI++;
			}
			else {
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNICorrecto[i] + " NO es correcto");
				contadorDNI++;
			}
		}
		for (int j=0; j < listaDNIIncorrecto.length; j++){
			if (testDNI.CheckDNI(listaDNIIncorrecto[j]) == true){
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNIIncorrecto[j] + " es correcto");
				contadorDNI++;
			}
			else {
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNIIncorrecto[j] + " NO es correcto");
				contadorDNI++;
			}
		}
		for (int k=0; k < listaNIECorrecto.length; k++){
			if (testNIE.CheckNIE(listaNIECorrecto[k]) == true){
				System.out.println("El NIE numero " + contadorNIE + ": " + listaNIECorrecto[k] + " es correcto");
				contadorNIE++;
			}
			else {
				System.out.println("El NIE numero " + contadorNIE + ": " + listaNIECorrecto[k] + " NO es correcto");
				contadorNIE++;
			}
		}
		for (int l=0; l < listaNIEIncorrecto.length; l++){
			if (testNIE.CheckNIE(listaNIEIncorrecto[l]) == true){
				System.out.println("El NIE numero " + contadorNIE + ": " + listaNIEIncorrecto[l] + " es correcto");
				contadorNIE++;
			}
			else {
				System.out.println("El NIE numero " + contadorNIE + ": " + listaNIEIncorrecto[l] + " NO es correcto");
				contadorNIE++;
			}
		}
	}
}

