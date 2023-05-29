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
    private int codigoEnvio; // nuevo atributo para el código de envío
    private static Envio[] envios; // arreglo de tipo Envio

    public Envio(float costo, Persona remitente, Persona destinatario, Persona clienteFactura, Caja caja,
            CajaPeso cajaPeso) {
        this.costo = costo;
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.clienteFactura = clienteFactura;
        this.caja = caja;
        this.cajaPeso = cajaPeso;
        this.codigoEnvio = generarCodigoEnvio();
        this.caja = new Caja();
        incrementarArreglo();
        Envio envio[];
 // generación del código de envío al crear una nueva instancia de Envio
    }

    public Envio() {
        // Inicializar el arreglo de envíos con un espacio
        if (envios == null) {
            envios = new Envio[1];
        }
        this.codigoEnvio = generarCodigoEnvio(); // generación del código de envío al crear una nueva instancia de Envio
    }

    public static Envio[] incrementarArreglo() {
        // Incrementar el tamaño del arreglo en 1
        Envio[] nuevoArreglo = new Envio[envios.length + 1];
        System.arraycopy(envios, 0, nuevoArreglo, 0, envios.length);
        envios = nuevoArreglo;
        return envios;
    }

    public static Envio buscarEnvio(int codigoEnvio) {
        for (Envio envio : envios) {
            if (envio != null && envio.getCodigoEnvio() == codigoEnvio) {
                return envio;
            }
        }
        System.out.println("No se encontró un envío con el código proporcionado: " + codigoEnvio);
        return null;
    }

    public void generarEnvio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("¿Eres REMITENTE o DESTINATARIO? ");
        String tipoPersona = scanner.nextLine();
        System.out.println("***** Solicitando Datos de Envio *****");
        System.out.println("***** Solicitar los Datos *****");
        System.out.print("Dame tu Nombre Completo: ");
        String nombreCompleto = scanner.nextLine();

        Persona persona = separarNombreDireccion(nombreCompleto);

        if (tipoPersona.equalsIgnoreCase("REMITENTE")) {
            remitente = persona;
        } else if (tipoPersona.equalsIgnoreCase("DESTINATARIO")) {
            destinatario = persona;
        } else {
            System.out.println("Error: Tipo de persona inválido.");
            return;
        }

        Envio nuevoEnvio = new Envio(costo, remitente, destinatario, clienteFactura, caja, cajaPeso);
        nuevoEnvio.solicitarDatos();
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
        System.out.println("Código de Envío: " + this.codigoEnvio); // mostrar el código de envío en la información de envío

        // Asignar el código de envío y agregar el envío al arreglo
        envios[envios.length - 1] = this;
        codigoEnvio++;
        this.codigoEnvio = generarCodigoEnvio();
        this.gen = true;
    }

    private void solicitarDatos() {
    }

    public int getCodigoEnvio() {
        return this.codigoEnvio;
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
        this.fac = true;
    }

    public void obtenerInformacionEnvio() {
        if (!gen) {
            System.out.println("Error: No se ha generado un envío.");
            return;
        }
        System.out.println("***** Información del Envío *****");
        System.out.println("\nREMITENTE:");
        if (remitente != null) {
            System.out.println(remitente);
        } else {
            System.out.println("N/A");
        }
        System.out.println("\nDESTINATARIO:");
        if (destinatario != null) {
            System.out.println(destinatario);
        } else {
            System.out.println("N/A");
        }
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
    public int generarCodigoEnvio() {
        // Lógica para generar un código de envío único
        return codigoEnvio++;
    }

}