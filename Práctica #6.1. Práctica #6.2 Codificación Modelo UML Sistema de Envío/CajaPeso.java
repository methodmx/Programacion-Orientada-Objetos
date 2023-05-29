public class CajaPeso {

    private Caja caja;
    private float peso;

    public CajaPeso(Caja caja, float peso) {
        this.caja = caja;
        this.peso = peso;
    }

    public float calcularPesoTotal() {
        return caja.getVolumen() * peso;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
