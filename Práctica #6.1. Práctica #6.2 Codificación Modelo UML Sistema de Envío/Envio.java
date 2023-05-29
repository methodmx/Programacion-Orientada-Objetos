import java.util.Scanner;

public class Envio {
    private float costo;
    private Persona remitente;
    private Persona destinatario;
    private Persona clienteFactura;
    private Caja caja;
    private CajaPeso cajaPeso;
    private boolean fac;
    private boolean gen;

    public Envio(float costo, Persona remitente, Persona destinatario, Persona clienteFactura, Caja caja,
            CajaPeso cajaPeso) {
        this.costo = costo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.clienteFactura = clienteFactura;
        this.caja = caja;
        this.cajaPeso = cajaPeso;
    }

    public void generarEnvio() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("***** Solicitando Datos de Envio *****");
        System.out.println("***** Solicitar los Datos del Remitente *****");
        System.out.print("Dame tu Nombre Completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("¿Eres REMITENTE o DESTINATARIO? ");
        String tipoPersona = scanner.nextLine();

        Persona persona = separarNombreDireccion(nombreCompleto);

        if (tipoPersona.equalsIgnoreCase("REMITENTE")) {
            remitente = persona;
        } else if (tipoPersona.equalsIgnoreCase("DESTINATARIO")) {
            destinatario = persona;
        } else {
            System.out.println("Error: Tipo de persona inválido.");
            return;
        }

        System.out.println("***** Solicitar los Datos de la Dirección *****");
        System.out.print("Dame la Calle: ");
        String calle = scanner.nextLine();
        System.out.print("Dame el Número Interno: ");
        String numeroInterno = scanner.nextLine();
        System.out.print("Dame la Colonia: ");
        String colonia = scanner.nextLine();
        System.out.print("Dame el Código Postal: ");
        String codigoPostal = scanner.nextLine();
        System.out.print("Dame la Ciudad: ");
        String ciudad = scanner.nextLine();
        System.out.print("Dame el País: ");
        String pais = scanner.nextLine();

        Direccion direccion = new Direccion(calle, numeroInterno, colonia, codigoPostal, ciudad, pais);
        persona.setDireccion(direccion);

        if (tipoPersona.equalsIgnoreCase("REMITENTE")) {
            remitente.setDireccion(direccion);
        } else if (tipoPersona.equalsIgnoreCase("DESTINATARIO")) {
            destinatario.setDireccion(direccion);
        }

        gen = true;

        System.out.println("Envío generado exitosamente.");
    }

    public void facturar() {
        if (!gen) {
            System.out.println("Error: No se ha generado un envío.");
            return;
        }

        if (fac) {
            System.out.println("Error: El envío ya ha sido facturado.");
            return;
        }

        System.out.println("Facturando envío...");
        // Lógica para facturar el envío

        fac = true;
        System.out.println("Envío facturado exitosamente.");
    }

    public void obtenerInformacionEnvio() {
        if (!gen) {
            System.out.println("Error: No se ha generado un envío.");
            return;
        }

        System.out.println("***** Información del Envío *****");
        System.out.println("REMITENTE:");
        System.out.println(remitente.toString());
        System.out.println("DESTINATARIO:");
        System.out.println(destinatario.toString());
        System.out.println("Estado de Envío: " + (fac ? "Facturado" : "No Facturado"));
    }

    private Persona separarNombreDireccion(String nombreCompleto) {
        String[] partesNombre = nombreCompleto.split(" ");
        String nombre1 = "";
        String nombre2 = "";
        String apellidoP = "";
        String apellidoM = "";
        String correoElectronico = "";

        if (partesNombre.length == 2) {
            nombre1 = partesNombre[0];
            apellidoP = partesNombre[1];
        } else if (partesNombre.length == 3) {
            nombre1 = partesNombre[0];
            nombre2 = partesNombre[1];
            apellidoP = partesNombre[2];
        } else if (partesNombre.length == 4) {
            nombre1 = partesNombre[0];
            nombre2 = partesNombre[1];
            apellidoP = partesNombre[2];
            apellidoM = partesNombre[3];
        } else {
            System.out.println("Error: Nombre completo inválido.");
            return null;
        }

        System.out.print("Dame tu Correo Electrónico: ");
        correoElectronico = new Scanner(System.in).nextLine();

        Direccion direccion = new Direccion("", "", "", "", "", "");
        Persona persona = new Persona(nombre1, nombre2, apellidoP, apellidoM, direccion, correoElectronico);
        persona.setDireccion(direccion);
        return persona;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public Persona getRemitente() {
        return remitente;
    }

    public void setRemitente(Persona remitente) {
        this.remitente = remitente;
    }

    public Persona getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public Persona getClienteFactura() {
        return clienteFactura;
    }

    public void setClienteFactura(Persona clienteFactura) {
        this.clienteFactura = clienteFactura;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public CajaPeso getCajaPeso() {
        return cajaPeso;
    }

    public void setCajaPeso(CajaPeso cajaPeso) {
        this.cajaPeso = cajaPeso;
    }

    public void calcularCosto() {
        // implementación para calcular el costo del envío
    }
}
