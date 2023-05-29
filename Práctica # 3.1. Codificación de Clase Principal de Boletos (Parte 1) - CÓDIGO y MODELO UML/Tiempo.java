import java.time.LocalTime;
import java.time.Duration;
class Tiempo {
    private int horas;
    private int minutos;
    private int segundos;

    public Tiempo(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public boolean validarTiempo() {
        // Validar horas, minutos y segundos
        if (horas < 0 || minutos < 0 || segundos < 0 || horas >= 24 || minutos >= 60 || segundos >= 60) {
            return false;
        }
        return true;
    }
    public Duration calcularDuracionDiferencia(Tiempo otroTiempo) {
        LocalTime tiempo1 = LocalTime.of(this.horas, this.minutos, this.segundos);
        LocalTime tiempo2 = LocalTime.of(otroTiempo.horas, otroTiempo.minutos, otroTiempo.segundos);

        // Calcular la duración entre los dos tiempos
        Duration duracionDiferencia = Duration.between(tiempo1, tiempo2);

        return duracionDiferencia;
    }
    public Tiempo restarHoras(Tiempo tiempo) {
        int segundosTotales = this.segundos + this.minutos * 60 + this.horas * 3600;
        int segundosTotalesRestar = tiempo.segundos + tiempo.minutos * 60 + tiempo.horas * 3600;
        int diferenciaSegundos = segundosTotales - segundosTotalesRestar;

        int horasDiferencia = diferenciaSegundos / 3600;
        int minutosDiferencia = (diferenciaSegundos % 3600) / 60;
        int segundosDiferencia = diferenciaSegundos % 60;

        return new Tiempo(horasDiferencia, minutosDiferencia, segundosDiferencia);
    }

    public boolean isBefore(Tiempo horaEntrada) {
        return false;
    }
}