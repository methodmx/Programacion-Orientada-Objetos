public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

    public int getSegundo() {
        return this.segundo;
    }
}