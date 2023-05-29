public class Demo3 {
    public static void main(String[] args) {
        Envio instEnvio1 = new Envio(10, 20, 15, 10, 3.41);
        Envio instEnvio2 = new Envio(2, 3, 4, 0.76, 1.28);

        System.out.println("El volumen del Envio #1 es: " + instEnvio1.calcularVolumen());
        System.out.println("El peso del Envio #1 es: " + instEnvio1.getPeso());
        System.out.println("El costo del Envio #1 es: " + instEnvio1.getCosto());

        System.out.println("El volumen del Envio #2 es: " + instEnvio2.calcularVolumen());
        System.out.println("El peso del Envio #2 es: " + instEnvio2.getPeso());
        System.out.println("El costo del Envio #2 es: " + instEnvio2.getCosto());
    }
}
