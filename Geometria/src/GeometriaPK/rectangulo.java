package GeometriaPK;

public class rectangulo extends Figura {

    private int ladoHorizontal = 0;
    private int ladoVertical = 0;

    public rectangulo(int ladoHorizontal, int ladoVertical) {
        this.ladoHorizontal = ladoHorizontal;
        this.ladoVertical = ladoVertical;
    }

    public rectangulo() {

    }

    public void setLadoHorizontal(int ladoHorizontal) {
        this.ladoHorizontal = ladoHorizontal;
    }

    public int getLadoHorizontal() {
        return ladoHorizontal;
    }

    public void setLadoVertical(int ladoVertical) {
        this.ladoVertical = ladoVertical;
    }

    public int getLadoVertical() {
        return ladoVertical;
    }

    @Override
    public double calcularArea() {
        return this.ladoVertical * this.ladoHorizontal;

    }

}
