package Java;
import java.util.Scanner;

public class ClasePrincipal {

    public static Scanner entrada = new Scanner(System.in);

    private static String[] nombreCmpleto = new String[4];
    private static String[] direccion = new String[6];
    private static String email;
    private static Envio Envios[];

    private static String[] separarCadena(int typeString, String cadena) {
        String[] cadenaSeparada;
        if (typeString == 1)
            cadenaSeparada = new String[4];
        else {
            cadenaSeparada = new String[6];
        }

        if (cadena.length() < 2) //Conciderar cadena vacia
            return cadenaSeparada;

        int posicionCadenaSeparada = 0, start = 0, end;

        for(int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == ' ') 
            {
                end = i;
                cadenaSeparada[posicionCadenaSeparada] = cadena.substring(start, end);
                start = i+1;
                posicionCadenaSeparada++;
            }
        }

        // Asignar la última palabra
        cadenaSeparada[posicionCadenaSeparada] = cadena.substring(start, cadena.length());

        return cadenaSeparada;
    }

    private static void solicitarDatosPersona(String typePerson) {

        String nombre;

        System.out.println("***** Solicitando Datos del " + typePerson + " *****");
        System.out.print("Dame tu nombre completo: ");
        nombre = entrada.nextLine();

        nombreCmpleto = separarCadena(1, nombre); //El numero 1 corresponde al nombre de una persona y el numero dos corresponde a una direccion

    }

    private static void solicitarDireccion() {

        String dir;

        System.out.println("***** Solicitando la Direccion *****");
        System.out.print("Dame tu direccion completa [calle, numero interno, colonia, codigo postal, ciudad, pais]: ");
        dir = entrada.nextLine();

        direccion = separarCadena(2, dir); //El numero 1 corresponde al nombre de una persona y el numero dos corresponde a una direccion

    }

    private static Envio[] incrementarEnvios(Envio envios[]) {

        Envio EnvioAuxiliar[] = new Envio[envios.length+1];
    
        for(int i=0; i < envios.length; i++) {
            EnvioAuxiliar[i] = envios[i];
        }
    
        return EnvioAuxiliar;
    }

    private static String printNamePersona(Persona persona) {

        String nombre = persona.getNombre1() + " " + persona.getNombre2() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno();
        return nombre;
    }

    private static String printDireccionPersona(Persona persona) {

        String direccion = persona.getDireccion().getCalle() + " " + persona.getDireccion().getNumeroInterno() + " " + persona.getDireccion().getColonia() + " " + persona.getDireccion().getCodigoPostal() + " " + persona.getDireccion().getCiudad() + " " + persona.getDireccion().getPais();
        return direccion;
    }

    private static void imprimirEnvio(String codigoEnvio) {
        for(int i=0; i < Envios.length; i++) {
            if (Envios[i].getCodigoEnvio() == codigoEnvio) 
            {
                System.out.println("Codigo de Envio: " + codigoEnvio);
                System.out.println("Nombre completo del remitente: " + printNamePersona(Envios[i].getRemitente()));
                System.out.println("Direccion del remitente: " + printDireccionPersona(Envios[i].getRemitente()));
                System.out.println("Nombre completo del destinatario: " + printNamePersona(Envios[i].getDestinatario()));
                System.out.println("Direccion del destinatario: " + printDireccionPersona(Envios[i].getDestinatario()));
                System.out.println("***** Informacion del paquete de envio *****");

                return;
            }
        }    
    }

    public static void main(String args[]) {

        int opt;

        do {
            System.out.println("***** Sistema de envio *****");
            System.out.println("[ 1 ] Generar envio");
            System.out.println("[ 2 ] Facturar");
            System.out.println("[ 3 ] Informacion de envio");
            System.out.println("[ 4 ] Salir");
            System.out.print("Elige una opcion: ");
            opt = entrada.nextInt();
            entrada.nextLine(); // Agregar esta línea para limpiar el buffer del teclado

            switch (opt) {
                case 1:
                    Envios = incrementarEnvios(Envios);
                    Envios[Envios.length - 1] = new Envio(String.valueOf(Envios.length));
                    System.out.println("***** Solicitando Datos de Envio *****");
                    solicitarDatosPersona("Remitente");
                    if (nombreCmpleto[3] != null) 
                    {
                        Envios[Envios.length - 1].setRemitente(new Persona(nombreCmpleto[0], nombreCmpleto[1], nombreCmpleto[2], nombreCmpleto[3]));
                    }
                    else if (nombreCmpleto[2] != null)
                    {
                        Envios[Envios.length - 1].setRemitente(new Persona(nombreCmpleto[0], nombreCmpleto[1], nombreCmpleto[2]));
                    }
                    else if (nombreCmpleto[1] != null)
                    {
                        Envios[Envios.length - 1].setRemitente(new Persona(nombreCmpleto[0], nombreCmpleto[1]));
                    }
                    else if (nombreCmpleto[0] != null)
                    {
                        Envios[Envios.length - 1].setRemitente(new Persona(nombreCmpleto[0]));
                    }
                    else
                    {
                        System.out.println("Advertencia: Nombre vacio");
                    }
                    nombreCmpleto = null;
                    System.out.println("Cual tu direccion de correo electronico:  ");
                    email = entrada.nextLine();
                    Envios[Envios.length - 1].getRemitente().setEmail(email);

                    solicitarDatosPersona("Destinatario");
                    if (nombreCmpleto[3] != null) 
                    {
                        Envios[Envios.length - 1].setDestinatario(new Persona(nombreCmpleto[0], nombreCmpleto[1], nombreCmpleto[2], nombreCmpleto[3]));
                    }
                    else if (nombreCmpleto[2] != null)
                    {
                        Envios[Envios.length - 1].setDestinatario(new Persona(nombreCmpleto[0], nombreCmpleto[1], nombreCmpleto[2]));
                    }
                    else if (nombreCmpleto[1] != null)
                    {
                        Envios[Envios.length - 1].setDestinatario(new Persona(nombreCmpleto[0], nombreCmpleto[1]));
                    }
                    else if (nombreCmpleto[0] != null)
                    {
                        Envios[Envios.length - 1].setDestinatario(new Persona(nombreCmpleto[0]));
                    }
                    else
                    {
                        System.out.println("Advertencia: Nombre vacio");
                    }
                    nombreCmpleto = null;
                    System.out.println("Cual tu direccion de correo electronico:  ");
                    email = entrada.nextLine();
                    Envios[Envios.length - 1].getDestinatario().setEmail(email);
                break;

                case 2:
                    solicitarDireccion();
                    if (direccion == null)
                        System.out.println("Advertencia: Direccion vacia");
                break;

                case 3:
                    System.out.println("***** Informacion del envio *****");
                    System.out.println("Dame el codigo de enivo: *");
                    imprimirEnvio(entrada.nextLine());   
                break;

                case 4:
                    System.out.println("Salir");
                break;

                default:
                    System.out.println("Errror: opcion no valida");
            }

        }while(opt != 4);
    }
}
