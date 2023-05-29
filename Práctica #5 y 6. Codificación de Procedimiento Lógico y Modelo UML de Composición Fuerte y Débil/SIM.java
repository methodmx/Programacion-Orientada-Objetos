package ComposicionFuerteDebil;

public class SIM {

    private String empresa;
    private int numeroMovil; 

    public SIM(String empresa,int numeroMovil){
        this.empresa=empresa;
        this.numeroMovil=numeroMovil;
    }

    public void setEmpresa(String empresa){
        this.empresa=empresa;
    }

    public String getEmpresa(){
        return empresa;
    }
    
    public void setNumeroMovil(int numeroMovil){
        this.numeroMovil=numeroMovil;
    }

    public int getNumeroMovil(){
        return numeroMovil;
    }
    
}