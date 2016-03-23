package org.furious4.Test;

import static org.junit.Assert.*;

import org.furious4.Logica.Ficha;
import org.furious4.Logica.OXO;
import org.junit.Test;

public class OXOTest {

	Ficha tablero[][] = new Ficha [3][3];
	
	
	@Test
	public void DadaUnaFichaCuandoFichaFueraDeLimiteEntoncesDevuelvoFalse() {
		assertFalse(OXO.ponerFicha(4, 1));
		assertFalse(OXO.ponerFicha(1, 4));
	}
	
	@Test
	public void DadoUnTableroCuandoColocasUnaFichaEnUnLugarOcupadoDaFalse(){
		assertTrue(OXO.ponerFicha(2, 1));
		assertFalse(OXO.ponerFicha(2, 1));
	}
	
	@Test
	public void dadoUnTableroCuandoInicializamosPosicionEntoncesTodosNull(){
		for (int fila = 0; fila < tablero.length; fila++){
			for (int columna = 0; columna < tablero[fila].length; columna++){
				assertNull(tablero[fila][columna]);
			}
		}
		
	}
	
	
}
