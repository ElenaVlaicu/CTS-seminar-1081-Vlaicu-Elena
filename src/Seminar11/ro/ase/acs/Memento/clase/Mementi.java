package Seminar11.ro.ase.acs.Memento.clase;

public class Mementi {

    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;

    public Mementi(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public int getNrSpectatori() {
        return nrSpectatori;
    }

    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }
}
