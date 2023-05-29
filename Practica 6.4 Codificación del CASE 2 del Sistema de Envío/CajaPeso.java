package Java;

public class CajaPeso extends Caja {
    private float peso;
    
    public CajaPeso(CajaPeso caja) {
        super(caja);
        this.peso = caja.peso;
    }
    
    public CajaPeso(CajaPeso caja, float peso) {
        super(caja);
        this.peso = peso;
    }
    
    public CajaPeso(float ancho, float altura, float profundidad) {
        super(ancho, altura, profundidad);
        this.peso = 0;
    }
    
    public CajaPeso(float ancho, float altura, float profundidad, float peso) {
        super(ancho, altura, profundidad);
        this.peso = peso;
    }
    
    public CajaPeso() {
        super();
        this.peso = 0;
    }
    
    public CajaPeso(float peso) {
        super();
        this.peso = peso;
    }
    
    public CajaPeso(float longitud, float peso) {
        super(longitud);
        this.peso = peso;
    }
    
    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public float getPeso() {
        return this.peso;
    }
}
