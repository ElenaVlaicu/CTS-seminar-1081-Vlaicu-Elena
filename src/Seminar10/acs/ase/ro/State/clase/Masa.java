package Seminar10.acs.ase.ro.State.clase;

public class Masa {

    private int nrMasa;
    private Stare tipStare;

    public Masa(int nrMasa) {
        this.nrMasa = nrMasa;
        this.tipStare = new StareLibera();
    }

    protected void setTipStare(Stare tipStare) {
        this.tipStare = tipStare;
    }

    public Stare getTipStare() {
        return tipStare;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void rezervaMasa(){
        StareRezervata rezervata = new StareRezervata();
        rezervata.modificaStare(this);
    }

    public void elibereazaMasa(){
        StareLibera libera = new StareLibera();
        libera.modificaStare(this);
    }

    public void ocupaMasa(){
        StareOcupata ocupata = new StareOcupata();
        ocupata.modificaStare(this);
    }

}
