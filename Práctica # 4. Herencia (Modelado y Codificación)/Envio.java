public class Envio extends CajaPeso {
    private double costo;

    public Envio(Envio envio) {
        super(envio);
        this.costo = envio.costo;
    }

    public Envio(double ancho, double altura, double profundidad, double peso, double costo) {
        super(ancho, altura, profundidad, peso);
        this.costo = costo;
    }

    public Envio() {
        super();
        this.costo = -1;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
