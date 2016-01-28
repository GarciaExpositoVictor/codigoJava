package TablaAsignacion;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidadorDNI {
	
private String DNI;
private String NIE;
	
	public ValidadorDNI(){
		this.DNI = "11111111A";
	}
	
	public ValidadorDNI(String DNI){
		this.DNI = DNI;
	}
	
	public void ValidadorNIE(){
		this.NIE = "X1111111";
	}
	
	public void ValidadorNIE(String NIE){
		this.NIE = NIE;		
	}
	
	public void CheckDNI(String DNI){
		String expresionRegular = "\\b(\\d{8})([^IÑOUa-z])\\b";
		
		Pattern patron = Pattern.compile(expresionRegular);
		Matcher coincidencia = patron.matcher(DNI);
		
		if (coincidencia.find()){
			String CorrectoDNI = coincidencia.group();
			System.out.println("El DNI " + CorrectoDNI + " es correcto");
		}
		else {
			System.out.println("El DNI NO es correcto");
		}
}
	public void CheckNIE(String NIE){
		String expresionRegularNIE = "\\b[XYZ](\\d{7})([^IÑOUa-z])\\b";
		
		Pattern patron = Pattern.compile(expresionRegularNIE);
		Matcher coincidencia = patron.matcher(NIE);
		
		if (coincidencia.find()){
			String CorrectoNIE = coincidencia.group();
			System.out.println("El NIE " + CorrectoNIE + " es correcto");
		}
		else {
			System.out.println("El NIE es incorrecto");
		}
}
}
