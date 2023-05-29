public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anio) {
        setFecha(dia, mes, anio);
    }

    public void setFecha(int dia, int mes, int anio) {
        setAnio(anio);
        setMes(mes);
        setDia(dia);
    }

    public void setDia(int dia) {
        if (dia >= 1 && dia <= 31) {
            if (mes == 2) {
                if (esBisiesto(anio) && dia == 29) {
                    this.dia = dia;
                } else if (dia > 28) {
                    this.dia = 28;
                    System.out.println("El mes de febrero del año " + anio + " tiene 28 días.");
                } else {
                    this.dia = dia;
                }
            } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 31) {
                this.dia = 30;
                System.out.println("El mes " + mes + " no tiene 31 dias.");
            } else {
                this.dia = dia;
            }
        } else {
            this.dia = 1;
            System.out.println("El dia esta fuera de rango [1,31]");
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.mes = 1;
            System.out.println("El mes esta fuera de rango [1,12]");
        }
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    private boolean esBisiesto(int anio) {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public void mostrarFecha() {
        System.out.printf("%02d/%02d/%04d\n", dia, mes, anio);
    }
}
