public class Taller2 {
    public static void main(String[] args) {
        ControlBoleto controlBoleto = new ControlBoleto();
        controlBoleto.setBoleto(1, 1, 2023, 8, 30, 0, 1, 1, 2023, 12, 30, 0);
        controlBoleto.setPrecioHora(15.0f);
        Boleto boleto = controlBoleto.getBoleto();
        float horasEstacionamiento = calcularHorasEstacionamiento(boleto);
        float pago = controlBoleto.calcularPago(horasEstacionamiento, controlBoleto.getPrecioHora());
        System.out.println("El pago por " + horasEstacionamiento + " horas de estacionamiento es: " + pago);
        System.out.println("Codigo de barras del boleto: " + boleto);
    }
    
    public static float calcularHorasEstacionamiento(Boleto boleto) {
        Fecha entradaFecha = boleto.getEntradaFecha();
        Tiempo entradaHora = boleto.getEntradaHora();
        Fecha salidaFecha = boleto.getSalidaFecha();
        Tiempo salidaHora = boleto.getSalidaHora();
        
        int horas = (salidaFecha.getDia() - entradaFecha.getDia()) * 24;
        horas += (salidaHora.getHora() - entradaHora.getHora());
        horas += (salidaHora.getMinuto() - entradaHora.getMinuto()) / 60.0;
        
        return horas;
    }
}
    
    
    

    
