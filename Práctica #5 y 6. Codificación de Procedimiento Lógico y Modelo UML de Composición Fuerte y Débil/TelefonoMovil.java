package ComposicionFuerteDebil;
public class TelefonoMovil {
    private String modelo;
    private Bateria bateria;
    private int numeroSIM;
    private SIM sim[];

    public TelefonoMovil(String modelo, double mAh, String marca, int maxSIM) {
        this.modelo = modelo;
        bateria = new Bateria(mAh, marca);
        this.numeroSIM = 0;
        this.sim = new SIM[maxSIM];
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setBateria(double mAh, String marca) {
        bateria.setmAh(mAh);
        bateria.setMarca(marca);
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setNumeroSIM(int numeroSIM) {
        this.numeroSIM = numeroSIM;
    }
    
    public int getNumeroSIM() {
        return numeroSIM;
    }

    private void aumentarTamanioSIM() {
        SIM[] newSim = new SIM[sim.length + 1];
        System.arraycopy(sim, 0, newSim, 0, sim.length);
        sim = newSim;
    }

    public void agregarSIM(int numeroMovil, String empresa) {
        if (numeroSIM < sim.length) {
            sim[numeroSIM] = new SIM(empresa, numeroMovil);
            numeroSIM++;
        } else {
            aumentarTamanioSIM();
            sim[numeroSIM] = new SIM(empresa, numeroMovil);
            numeroSIM++;
        }
    }
    
    public SIM[] getSIM() {
        return sim;
    }

    public void imprimirInformacion() {
        System.out.println("Modelo de Teléfono: " + modelo);
        System.out.println("Marca de Batería: " + bateria.getMarca());
        System.out.println("mAh de Batería: " + bateria.getmAh());
        System.out.println("Número de SIMs: " + numeroSIM);
        System.out.println("Datos de las SIMs:");
        for (int i = 0; i < numeroSIM; i++) {
            System.out.println("SIM #" + (i + 1) + ":");
            System.out.println("    Número Telefónico: " + sim[i].getNumeroMovil());
            System.out.println("    Empresa de Telefonía: " + sim[i].getEmpresa());
        }
    }
}