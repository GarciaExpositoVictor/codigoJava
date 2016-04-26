/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ShipKata;

/**
 *
 * @author Thiwer
 */
public class RobotKata {

    public char[][] Tierra;
    public int x, y;
    public char rumbo;
    public final int height = 10;
    public final int width = height;

    public RobotKata() {
        x = 0;
        y = 0;
        rumbo = 'N';
    }

    public RobotKata(int x, int y, char rumbo) {
        this.x = x;
        this.y = y;
        this.rumbo = rumbo;
        this.Tierra = new char[height][width];
        rellenarTierra();

    }

    public boolean girar(char direccion) {

        switch (rumbo) {
            case 'N':
                if (direccion == 'l') {
                    rumbo = 'W';
                } else {
                    rumbo = 'E';
                }
                break;
            case 'W':
                if (direccion == 'l') {
                    rumbo = 'S';
                } else {
                    rumbo = 'W';
                }
                break;
            case 'S':
                if (direccion == 'l') {
                    rumbo = 'E';
                } else {
                    rumbo = 'N';
                }
                break;
            case 'E':
                if (direccion == 'l') {
                    rumbo = 'N';
                } else {
                    rumbo = 'S';
                }
                break;
            default:
                throw new AssertionError();
        }
        return false;
    }

    public void moverse(char direccion) {

        switch (rumbo) {

            case 'N':
                /*Si la dierccion a la que nos vamos a mover es tierra se cancela
                 el movimiento*/
                if (direccion == 'F') {
                    if (Tierra[--y][x] == 'T') {
                        System.out.println("NO MAS IORAR1");
                    } else {
                        y--;
                    }
                /*En el caso de que vayamos patras y haya tierra no nos movemos*/
                } else {
                    if (Tierra[++y][x] == 'T') {
                        System.out.println("NO MAS IORAR2");
                    } else {
                        y++;
                    }

                }

                break;
            case 'E':
                if (direccion == 'F') {
                    if (Tierra[y][++x] == 'T') {
                        System.out.println("NO MAS IORAR3");
                    } else {
                        x++;
                    }
                } else {
                    if (Tierra[y][--x] == 'T') {
                        System.out.println("NO MAS IORAR4");
                    } else {
                        x--;
                    }
                }
                break;
            case 'S':
               
                if (direccion == 'F') {
                    if (Tierra[++y % height][x % width] == 'T') {
                        System.out.println("NO MAS IORAR5");
                    } else {
                        y = ++y % height;
                    }
                } else {
                    
                    if (Tierra[--y][x] == 'T') {
                        System.out.println("NO MAS IORAR6");
                    } else {
                        y--;
                    }
                }
                
                break;
            case 'W':
                if (direccion == 'F') {
                    if (Tierra[y][--x] == 'T') {
                        System.out.println("NO MAS IORAR7");
                    } else {
                        x--;
                    }

                } else {
                    if (Tierra[y][++x] == 'T') {
                        System.out.println("NO MAS IORAR8");
                    } else {
                        x++;
                    }
                }
                break;
            default:
                throw new AssertionError("Ha pasado algo inesperado en nustros bodys");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getRumbo() {
        return rumbo;
    }

    public void setRumbo(char rumbo) {
        this.rumbo = rumbo;
    }

    private void rellenarTierra() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Tierra[i][j] = 'A';
            }
        }
        Tierra[0][1] = 'T';
        Tierra[1][1] = 'T';
        Tierra[2][1] = 'T';
        Tierra[1][2] = 'T';
    }

}
