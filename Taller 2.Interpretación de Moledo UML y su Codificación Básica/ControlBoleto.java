public class ControlBoleto {
    private Boleto boleto;
    private float precioHora;

    public ControlBoleto() {
        this.boleto = new Boleto();
        this.precioHora = 0.0f;
    }

    public void setBoleto(int diaE, int mesE, int anioE, int horaE, int minutoE, int segundoE,
                          int diaS, int mesS, int anioS, int horaS, int minutoS, int segundoS) {
        this.boleto.setEntradaFecha(diaE, mesE, anioE);
        this.boleto.setEntradaHora(horaE, minutoE, segundoE);
        this.boleto.setSalidaFecha(diaS, mesS, anioS);
        this.boleto.setSalidaHora(horaS, minutoS, segundoS);
    }

    public Boleto getBoleto() {
        return this.boleto;
    }

    public void setPrecioHora(float precioHora) {
        this.precioHora = precioHora;
    }

    public float getPrecioHora() {
        return this.precioHora;
    }

    public float calcularPago(float horasEstacionamiento, float precioHora) {
        return horasEstacionamiento * precioHora;
    }
}