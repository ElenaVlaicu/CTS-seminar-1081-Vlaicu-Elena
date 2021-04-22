package Seminar9.acs.ase.ro.claseFlyweight;

public class Rezervare {
    //starea temporara
    //relatie has a client-rezervare

    private int nrMasa;
    private int nrPersoane;
    private int ora;

    public Rezervare(int nrMasa, int nrPersoane, int ora) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.ora = ora;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nrMasa=" + nrMasa +
                ", nrPersoane=" + nrPersoane +
                ", ora='" + ora + '\'' +
                '}';
    }
}
