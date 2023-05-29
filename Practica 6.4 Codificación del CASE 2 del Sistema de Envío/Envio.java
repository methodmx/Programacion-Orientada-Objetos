package Java;

public class Envio extends Caja{
    private float costo;
    private Persona remitente;
    private Persona destinatario;
    private Persona clienteFactura;
    private String codigoEnvio;
    
    public Envio(String codigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }
    
    public Envio(String codigoEnvio, Caja caja) {
        this.codigoEnvio = codigoEnvio;
    }
    
    public Envio(String codigoEnvio, Caja caja, float costo) {
        this.codigoEnvio = codigoEnvio;
        this.costo = costo;
    }
    
    public Envio(String codigoEnvio, float ancho, float altura, float profundidad, float peso, float costo) {
        this.codigoEnvio = codigoEnvio;
        this.costo = costo;
    }
    
    public Envio(String codigoEnvio, float longitud, float peso, float costo) {
        this.codigoEnvio = codigoEnvio;
        this.costo = costo;
    }
    
    public Envio(String codigoEnvio, float peso, float costo) {
        this.codigoEnvio = codigoEnvio;
        this.costo = costo;
    }
    
    public Envio(String codigoEnvio, float costo) {
        this.codigoEnvio = codigoEnvio;
        this.costo = costo;
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

    public String getCodigoEnvio() {
        return codigoEnvio;
    }
    
    public void setCodigoEnvioa(String CodigoEnvio) {
        this.codigoEnvio = codigoEnvio;
    }
}
