import java.time.LocalDate;
import java.time.Period;
// Clase Fecha para representar una fecha
class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    public int calcularDiasDiferencia(Fecha otraFecha) {
        LocalDate fecha1 = LocalDate.of(this.año, this.mes, this.dia);
        LocalDate fecha2 = LocalDate.of(otraFecha.año, otraFecha.mes, otraFecha.dia);
        Period period = Period.between(fecha1, fecha2);
        int diasDiferencia = period.getDays();
        return diasDiferencia;
    }
    public boolean validarFecha() {
        // Validar día, mes y año
        if (dia <= 0 || mes <= 0 || año <= 0 || mes > 12 || dia > obtenerDiasEnMes()) {
            return false;
        }
        return true;
    }

    private int obtenerDiasEnMes() {
        int[] diasEnMes = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if (mes == 2 && (año % 4 == 0 && año % 100 != 0 || año % 400 == 0)) {
            return 29; // Año bisiesto
        } else {
            return diasEnMes[mes - 1];
        }
    }
    public boolean isBefore(Fecha fechaEntrada) {
        return false;
    }
}