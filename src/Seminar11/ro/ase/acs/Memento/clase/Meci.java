package Seminar11.ro.ase.acs.Memento.clase;

public class Meci {

    private String echipaGazda;
    private String echipaOaspeti;
    private int nrBileteVandute;
    private int nrSpectatori;
    private int nrJandarmi;
    private int nrStewarzi;

    public Meci(String echipaGazda, String echipaOaspeti, int nrBileteVandute, int nrSpectatori, int nrJandarmi, int nrStewarzi) {
        this.echipaGazda = echipaGazda;
        this.echipaOaspeti = echipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrSpectatori = nrSpectatori;
        this.nrJandarmi = nrJandarmi;
        this.nrStewarzi = nrStewarzi;
    }

    public Mementi creazaMemento(){
        Mementi memento = new Mementi(this.nrSpectatori, this.echipaGazda, this.echipaOaspeti);
        return memento;
    }

    public void seteazaMemento(Mementi memento){

        this.nrSpectatori = memento.getNrSpectatori();
        this.echipaGazda = memento.getNumeEchipaGazda();
        this.echipaOaspeti = memento.getNumeEchipaOaspeti();
    }

    @Override
    public String toString() {
        return "Meci{" +
                "echipaGazda='" + echipaGazda + '\'' +
                ", echipaOaspeti='" + echipaOaspeti + '\'' +
                ", nrBileteVandute=" + nrBileteVandute +
                ", nrSpectatori=" + nrSpectatori +
                ", nrJandarmi=" + nrJandarmi +
                ", nrStewarzi=" + nrStewarzi +
                '}';
    }

    public void setEchipaGazda(String echipaGazda) {
        this.echipaGazda = echipaGazda;
    }

    public void setEchipaOaspeti(String echipaOaspeti) {
        this.echipaOaspeti = echipaOaspeti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }

    public void setNrStewarzi(int nrStewarzi) {
        this.nrStewarzi = nrStewarzi;
    }
}
