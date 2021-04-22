package Seminar9.acs.ase.ro.claseCommand;

public abstract class Comanda {
    public abstract void executa();
    protected Masa masa;

    public Comanda(Masa masa) {
        this.masa = masa;
    }
}
