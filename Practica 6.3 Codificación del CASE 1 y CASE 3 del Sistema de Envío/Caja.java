import java.util.Scanner;

public class Caja {
    private float altura;
    private float ancho;
    private float profundidad;

    public Caja() {
        this.altura = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public void solicitarDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la altura de la caja: ");
        this.altura = scanner.nextFloat();
        System.out.print("Ingrese el ancho de la caja: ");
        this.ancho = scanner.nextFloat();
        System.out.print("Ingrese la profundidad de la caja: ");
        this.profundidad = scanner.nextFloat();
    }

    public void imprimirDatos() {
        System.out.println("La caja tiene las siguientes dimensiones:");
        System.out.println("Altura: " + this.altura);
        System.out.println("Ancho: " + this.ancho);
        System.out.println("Profundidad: " + this.profundidad);
    }

    public void calcularVolumen() {
        float volumen = this.ancho * this.altura * this.profundidad;
        System.out.println("El volumen de la caja es: " + volumen);
    }

    public float getVolumen() {
        return altura * ancho * profundidad;
    }
}
