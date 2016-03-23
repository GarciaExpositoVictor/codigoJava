package org.furious4.Logica;

public class OXO {
	
		public static final int fila = 3;
		public static final int columna = 3;
		public static Ficha[][] tablero = new Ficha[fila][columna];	
				
		//Logica
		
		public static boolean ponerFicha(int fila, int columna){
			if (checkFila(fila) && checkColumnas(columna)){
				return true;
			}else{
				return false;
			}
		}
		
		public static boolean checkFila(int fila){
			if (fila < 1 || fila > 3){
				return false;
			}else{
				return true;
			}
		}
		
		public static boolean checkColumnas(int columna){
			if (columna < 1 || columna > 3){
				return false;
			}else{
				return true;
			}
		}	
		
		public static boolean ponerFicha(int fila, int columna, Ficha[][] tablero){
			if(columna != 0 | fila != 0){
				return true;
			}
			else{
				return false;				}
		}
		
		
}


