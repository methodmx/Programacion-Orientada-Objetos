import java.time.Duration;

class Boleto {
    private static int contadorCodigoBarras = 0;
    private String codigoBarras;
    private Fecha fechaEntrada;
    private Tiempo horaEntrada;
    private Fecha fechaSalida;
    private Tiempo horaSalida;
    private double precioPorHora;

    public Boleto(Fecha fechaEntrada, Tiempo horaEntrada, Fecha fechaSalida, Tiempo horaSalida, double precioPorHora) {
        contadorCodigoBarras++;
        codigoBarras = String.format("%06d", contadorCodigoBarras);
        this.fechaEntrada = fechaEntrada;
        this.horaEntrada = horaEntrada;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.precioPorHora = precioPorHora;
    }
    public String getCodigoBarras() {
        return codigoBarras;
    }
    public double calcularTotalAPagar() {
        int diasDiferencia = fechaSalida.calcularDiasDiferencia(fechaEntrada);
        
        Duration duracionDiferencia = horaSalida.calcularDuracionDiferencia(horaEntrada);

        long totalHoras = diasDiferencia * 24 + duracionDiferencia.toHours();

        double totalAPagar = totalHoras * precioPorHora;

        return totalAPagar;
    }
}