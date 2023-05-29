public class CajaPeso extends Caja {
    private double peso;

    public CajaPeso(CajaPeso cajaPeso) {
        super(cajaPeso);
        this.peso = cajaPeso.peso;
    }

    public CajaPeso(double ancho, double altura, double profundidad, double peso) {
        super(ancho, altura, profundidad);
        this.peso = peso;
    }

    public CajaPeso() {
        super();
        this.peso = -1;
    }

    public CajaPeso(double longitud, double peso) {
        super(longitud);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}