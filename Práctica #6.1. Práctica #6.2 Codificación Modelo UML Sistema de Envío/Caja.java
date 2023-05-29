public class Caja {

    private float Ancho;
    private float Altura;
    private float Profundidad;

    public Caja(float Ancho, float Altura, float Profundidad) {
        this.Ancho = Ancho;
        this.Altura = Altura;
        this.Profundidad = Profundidad;
    }

    public float getAncho() {
        return Ancho;
    }

    public void setAncho(float Ancho) {
        this.Ancho = Ancho;
    }

    public float getAltura() {
        return Altura;
    }

    public void setAltura(float Altura) {
        this.Altura = Altura;
    }

    public float getProfundidad() {
        return Profundidad;
    }

    public void setProfundidad(float Profundidad) {
        this.Profundidad = Profundidad;
    }

    public void setVolumen(float Ancho, float Altura, float Profundidad) {
        this.Ancho = Ancho;
        this.Altura = Altura;
        this.Profundidad = Profundidad;
    }

    public float getVolumen() {
        return Ancho * Altura * Profundidad;
    }

}