public class Tiempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tiempo(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("La hora esta fuera del rango");
            this.hora = 0;
        }

        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Los minutos estan fuera del rango");
            this.minuto = 0;
        }

        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Los segundos estan fuera del rango");
            this.segundo = 0;
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
        } else {
            System.out.println("La hora esta fuera del rango");
        }
    }

    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            System.out.println("Los minutos estan fuera del rango");
        }
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            System.out.println("Los segundos estan fuera del rango");
        }
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void mostrarTiempo() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }
}
