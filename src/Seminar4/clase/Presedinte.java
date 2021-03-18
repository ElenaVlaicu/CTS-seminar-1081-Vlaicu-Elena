package Seminar4.clase;

public class Presedinte {
    //singletone - constructori privati, instanta static
    //eager initialization


    private String nume;
    private int varsta;
    private int mandat;

    private Presedinte(String nume, int varsta, int mandat) {
        this.nume = nume;
        this.varsta = varsta;
        this.mandat = mandat;
    }

    public Presedinte() {
        this.nume = "Putin";
        this.varsta = 68;
        this.mandat = 10;
    }

    //eager initialization - poate fi si private si public, dar de obicei e private
    public static Presedinte instance = new Presedinte();

    public static Presedinte genInstance(){
        return instance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Presedinte{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", mandat=").append(mandat);
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public int getMandat() {
        return mandat;
    }

    public void setMandat(int mandat) {
        this.mandat = mandat;
    }

    public static Presedinte getInstance() {
        return instance;
    }

    public static void setInstance(Presedinte instance) {
        Presedinte.instance = instance;
    }
}
