import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Crear instancias de Envio y Caja fuera del bucle
        Envio envio = new Envio();
        Caja caja = new Caja();

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
                    System.out.println("***** Solicitando Datos de Envio *****");
                    envio.generarEnvio();
                    System.out.println("***Ingresar datos de una caja***");
                    caja.solicitarDatos();
                    break;
                case 2:
                    envio.facturar();
                    break;
                case 3:
                    System.out.print("Ingrese el número de envío: ");
                    int numeroEnvio = scanner.nextInt();
                    Envio envioBuscado = Envio.buscarEnvio(numeroEnvio);
                if (envioBuscado != null) {
                    System.out.println("===== Información del Envío =====");
                    envioBuscado.obtenerInformacionEnvio();
                    caja.imprimirDatos();
                    caja.calcularVolumen();
                } else {
                    System.out.println("No se encontró un envío con ese número.");
                }
                    break;
                case 4:
                    System.out.println("Saliendo del menú...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor seleccione otra opción.");
                    break; 
            }

        } while (opcion != 4);

        scanner.close();
    }
}
