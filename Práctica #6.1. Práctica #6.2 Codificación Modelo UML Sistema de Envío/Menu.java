import java.util.Scanner;

public class Menu {
    private Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);
    }

    public void mostrar() {
        int opcion = 0;

        do {
            System.out.println("===== Menú =====");
            System.out.println("1. Generar Envío");
            System.out.println("2. Facturar");
            System.out.println("3. Información de Envío");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    generarEnvio();
                    break;
                case 2:
                    facturar();
                    break;
                case 3:
                    informacionEnvio();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo.");
                    break;
            }

            System.out.println();
        } while (opcion != 4);
    }

    private void separarPalabras() {
        System.out.println("Seprar palanras...");
    }

    private void generarEnvio() {
        System.out.println("Generando envío...");
    }

    private void facturar() {
        System.out.println("Facturando...");
    }

    private void informacionEnvio() {
        System.out.println("Obteniendo información de envío...");
    }
}
