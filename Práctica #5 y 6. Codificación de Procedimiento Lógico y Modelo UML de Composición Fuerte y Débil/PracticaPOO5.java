package ComposicionFuerteDebil;
import java.util.Scanner;

public class PracticaPOO5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TelefonoMovil telefono = null;
        int opcion;

        do {
            System.out.println("Menu de opciones");
            System.out.println("1: Crear Telefono Movil");
            System.out.println("2: Agregar SIM a Telefono Movil");
            System.out.println("3: Imprimir la Informacion del Telefono");
            System.out.println("4: Salir");
            System.out.print("Elige una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("El modelo del Telefono Movil es: ");
                    String modelo = scanner.nextLine();
                    System.out.print("La marca de la Bateria es: ");
                    String marcaBateria = scanner.nextLine();
                    System.out.print("El mAh de la Bateria es: ");
                    double mAh = scanner.nextDouble();
                    scanner.nextLine();
                    telefono = new TelefonoMovil(modelo, mAh, marcaBateria, opcion);
                    break;
                case 2:
                    boolean agregarOtroSIM = true;
                    do {
                    System.out.print("Numero Telefonico SIM: ");
                    int numeroMovil = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre de la Empresa de Telefonia: ");
                    String empresa = scanner.nextLine();
                    telefono.agregarSIM(numeroMovil, empresa);
                    System.out.print("¿Deseas agregar otro SIM? (S/N): ");
                    String respuesta = scanner.nextLine();
                    agregarOtroSIM = respuesta.equalsIgnoreCase("S");
    } while (agregarOtroSIM);
    break;
                case 3:
                    if (telefono != null) {
                        telefono.imprimirInformacion();
                    } else {
                        System.out.println("No se ha creado un Telefono Movil.");
                    }
                    break;
                case 4:
                    System.out.println("Adios!");
                    break;
                default:
                    System.out.println("Opcion no valida.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}