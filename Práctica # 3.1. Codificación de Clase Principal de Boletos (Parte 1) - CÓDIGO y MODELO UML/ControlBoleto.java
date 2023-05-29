class ControlBoleto {
    public static void main(String[] args) {
        Fecha fechaEntrada = new Fecha(3, 4, 2023); 
        Tiempo horaEntrada = new Tiempo(10, 30, 0); 
        Fecha fechaSalida = new Fecha(4, 4, 2023); 
        Tiempo horaSalida = new Tiempo(15, 45, 0); 
        double precioPorHora = 12.50;
        Boleto boleto = new Boleto(fechaEntrada, horaEntrada, fechaSalida, horaSalida, precioPorHora);

        // Calcular el total a pagar
        double totalAPagar = boleto.calcularTotalAPagar();
        double totalAPagarT = Math.abs(totalAPagar);

        // Mostrar el total a pagar
        System.out.println("Total a pagar: " + totalAPagarT + " pesos");
        System.out.println("Código de Barras: " + boleto.getCodigoBarras());
    }
}