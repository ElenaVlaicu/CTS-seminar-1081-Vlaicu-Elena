package Seminar4.clase;

public class Televizor {

    private String marca;
    private int nrCanale;
    private float pret;

    private static Televizor instance = null;

    private Televizor(String marca, int nrCanale, float pret) {
        this.marca = marca;
        this.nrCanale = nrCanale;
        this.pret = pret;
    }

    private Televizor() {
        this.marca = "Samsung";
        this.nrCanale=100;
        this.pret = 123.99f;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Televizor{");
        sb.append("marca='").append(marca).append('\'');
        sb.append(", nrCanale=").append(nrCanale);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNrCanale(int nrCanale) {
        this.nrCanale = nrCanale;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    public synchronized static Televizor getInstance(String marca, int nrCanale, float pret) {
        if(instance==null) {
            instance = new Televizor(marca, nrCanale, pret);
        }
        return instance;
    }
}
