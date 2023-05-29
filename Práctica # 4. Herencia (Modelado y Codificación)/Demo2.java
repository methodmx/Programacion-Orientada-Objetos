public class Demo2 {
    public static void main(String[] args) {
        CajaPeso instCajaPeso1 = new CajaPeso(10, 20, 15, 34.3);
        CajaPeso instCajaPeso2 = new CajaPeso(2, 3, 4, 0.076);
        CajaPeso instCajaPeso3 = new CajaPeso();
        CajaPeso instCajaPeso4 = new CajaPeso(3, 2);
        CajaPeso instCajaPeso5 = new CajaPeso(instCajaPeso1);

        System.out.println("El volumen de instCajaPeso1 es: " + instCajaPeso1.calcularVolumen());
        System.out.println("El peso de instCajaPeso1 es: " + instCajaPeso1.getPeso());
        System.out.println("El volumen de instCajaPeso2 es: " + instCajaPeso2.calcularVolumen());
        System.out.println("El peso de instCajaPeso2 es: " + instCajaPeso2.getPeso());
        System.out.println("El volumen de instCajaPeso3 es: " + instCajaPeso3.calcularVolumen());
        System.out.println("El peso de instCajaPeso3 es: " + instCajaPeso3.getPeso());
        System.out.println("El volumen de instCajaPeso4 es: " + instCajaPeso4.calcularVolumen());
        System.out.println("El peso de instCajaPeso4 es: " + instCajaPeso4.getPeso());
        System.out.println("El volumen de instCajaPeso5 es: " + instCajaPeso5.calcularVolumen());
        System.out.println("El peso de instCajaPeso5 es: " + instCajaPeso5.getPeso());
    }
}
