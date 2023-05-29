class Persona {
    private String nombre1;
    private String nombre2;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Direccion direccion;
    private String correoElectronico;

    public Persona(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno, Direccion direccion,
            String correoElectronico) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
    }

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String toString() {
        String nombreCompleto = nombre1 + " " + (nombre2.isEmpty() ? "" : nombre2 + " ") + apellidoPaterno + " " + (apellidoMaterno.isEmpty() ? "" : apellidoMaterno);
        String direccionCompleta = direccion.toString();
        String correo = correoElectronico;
        return "Nombre completo: " + nombreCompleto + "\n" + direccionCompleta + "\n" + "Correo electrónico: " + correo;
    }
}
