package Java;

public class Persona {
    private String nombre1;
    private String nombre2;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Direccion direccion;
    private String email;

    public Persona(String nombre1) {
        this.nombre1 = nombre1;
    }
    
    public Persona(String nombre1, String apellidoPaterno) {
        this.nombre1 = nombre1;
        this.apellidoPaterno = apellidoPaterno;
    }

    public Persona(String nombre1, String apellidoPaterno, String apellidoMaterno) {
        this.nombre1 = nombre1;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Persona(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Persona(String nombre1, Direccion direccion, String email) {
        this.nombre1 = nombre1;
        this.direccion = direccion;
        this.email = email;
    }

    public Persona(String nombre1, String apellidoPaterno, Direccion direccion, String email) {
        this.nombre1 = nombre1;
        this.apellidoPaterno = apellidoPaterno;
        this.direccion = direccion;
        this.email = email;
    }

    public Persona(String nombre1, String apellidoPaterno, String apellidoMaterno, Direccion direccion, String email) {
        this.nombre1 = nombre1;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.email = email;
    }

    public Persona(String nombre1, String nombre2, String apellidoPaterno, String apellidoMaterno, Direccion direccion, String email) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
