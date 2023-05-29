public class Boleto {
    private String codigoBarras;
    private Fecha entradaFecha;
    private Tiempo entradaHora;
    private Fecha salidaFecha;
    private Tiempo salidaHora;

    public Boleto() {
        this.codigoBarras = "";
        this.entradaFecha = new Fecha(1, 1, 2022);
        this.entradaHora = new Tiempo();
        this.salidaFecha = new Fecha(1, 1, 2022);
        this.salidaHora = new Tiempo();
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() {
        return this.codigoBarras;
    }

    public void setEntradaFecha(int dia, int mes, int anio) {
        this.entradaFecha.setDia(dia);
        this.entradaFecha.setMes(mes);
        this.entradaFecha.setAnio(anio);
    }

    public Fecha getEntradaFecha() {
        return this.entradaFecha;
    }

    public void setEntradaHora(int hora, int minuto, int segundo) {
        this.entradaHora.setHora(hora);
        this.entradaHora.setMinuto(minuto);
        this.entradaHora.setSegundo(segundo);
    }

    public Tiempo getEntradaHora() {
        return this.entradaHora;
    }

    public void setSalidaFecha(int dia, int mes, int anio) {
        this.salidaFecha.setDia(dia);
        this.salidaFecha.setMes(mes);
        this.salidaFecha.setAnio(anio);
    }

    public Fecha getSalidaFecha() {
        return this.salidaFecha;
    }

    public void setSalidaHora(int hora, int minuto, int segundo) {
        this.salidaHora.setHora(hora);
        this.salidaHora.setMinuto(minuto);
        this.salidaHora.setSegundo(segundo);
    }

    public Tiempo getSalidaHora() {
        return this.salidaHora;
    }
}