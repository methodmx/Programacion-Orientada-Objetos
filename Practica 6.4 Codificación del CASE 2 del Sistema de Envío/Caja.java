package Java;

public class Caja {
    private float ancho;
    private float altura;
    private float profundidad;
    
    public Caja(Caja caja) {
        this.ancho = caja.ancho;
        this.altura = caja.altura;
        this.profundidad = caja.profundidad;
    }
    
    public Caja(float ancho, float altura, float profundidad) {
        this.ancho = ancho;
        this.altura = altura;
        this.profundidad = profundidad;
    }
    
    public Caja() {
        this.ancho = 0;
        this.altura = 0;
        this.profundidad = 0;
    }
    
    public Caja(float longitud) {
        this.ancho = longitud;
        this.altura = longitud;
        this.profundidad = longitud;
    }
    
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    
    public float getAncho() {
        return this.ancho;
    }
    
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float getAltura() {
        return this.altura;
    }
    
    public void setProfundidad(float profundidad) {
        this.profundidad = profundidad;
    }
    
    public float getProfundidad() {
        return this.profundidad;
    }
    
    public float getVolumen() {
        return this.ancho * this.altura * this.profundidad;
    }
}
