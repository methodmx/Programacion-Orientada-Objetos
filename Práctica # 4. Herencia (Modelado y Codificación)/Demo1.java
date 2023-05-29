public class Demo1 {
    public static void main(String[] args) {
        CajaPeso instCajaPeso = new CajaPeso(3, 5, 7, 8.37);

        Caja instCajaSimple = new Caja();
        instCajaSimple = instCajaPeso;

        double volumenCP = instCajaPeso.calcularVolumen();
        System.out.println("El volumen de la instancia CajaPeso es: " + volumenCP);

        double pesoCP = instCajaPeso.getPeso();
        System.out.println("El peso de la CajaPeso es: " + pesoCP);

        double volumenCS = instCajaSimple.calcularVolumen();
        System.out.println("El volumen de la instancia CajaSimple es: " + volumenCS);
    }
}
