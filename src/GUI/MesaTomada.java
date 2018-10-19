
package GUI;


public class MesaTomada {
    private String mesero;
    private int numeroMesa;
    private double importe;
    
    public MesaTomada(int numeroMesa,String mesero,double importe){
        this.mesero=mesero;
        this.numeroMesa=numeroMesa;
        this.importe=importe;
    }

    public String getMesero() {
        return mesero;
    }

    public void setMesero(String mesero) {
        this.mesero = mesero;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
