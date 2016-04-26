/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipKata;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thiwer
 */
public class RobotKataTest {
    
    
    public RobotKataTest() {
        
    }
    
    
    
    @Test
    public void cuandoRobotPosicionFueraDeLimitesVuelveAlLadoContrario(){
        RobotKata rk = new RobotKata(0, 0, 'N');
        RobotKata rk2 = new RobotKata(0, 0, 'N');
        //vuelta derecha
        rk.girar('l');
        rk2.rumbo = 'W';
        assertNotSame(rk, rk2);       
        rk.girar('l');
        rk2.rumbo = 'S';
        assertNotSame(rk, rk2);
        rk.girar('l');
        rk2.rumbo = 'E';
        assertNotSame(rk, rk2);
        rk.girar('l');
        rk2.rumbo = 'N';
        assertNotSame(rk, rk2);
        //vuelta izquierda
        rk = new RobotKata(0, 0, 'N');
        rk2 = new RobotKata(0, 0, 'N');
        rk.girar('r');
        rk2.rumbo = 'E';
        assertNotSame(rk, rk2);       
        rk.girar('r');
        rk2.rumbo = 'S';
        assertNotSame(rk, rk2);
        rk.girar('r');
        rk2.rumbo = 'W';
        assertNotSame(rk, rk2);
        rk.girar('r');
        rk2.rumbo = 'N';
        assertNotSame(rk, rk2);
        
        //movimiento derecha
        rk = new RobotKata(0, 0, 'N');
        rk2 = new RobotKata(0, 0, 'N');
        rk.girar('r');
        rk.moverse('F');
        rk2.rumbo = 'E';
        rk2.x = 0;
        rk2.y = 1;
        assertNotSame(rk, rk2);       
        rk.girar('r');
        rk.moverse('F');
        rk2.x = 1;
        rk2.y = 1;
        rk2.rumbo = 'S';
        assertNotSame(rk, rk2);
        rk.girar('r');
        rk.moverse('F');
        rk2.rumbo = 'W';
        rk2.x = 1;
        rk2.y = 0;
        assertNotSame(rk, rk2);
        rk.girar('r');
        rk.moverse('F');
        rk2.rumbo = 'N';
        rk2.x = 0;
        rk2.y = 0;
        assertNotSame(rk, rk2);
        
        
    }
   
    
}
