package Seminar9.acs.ase.ro.claseCommand;

public abstract class Comanda {

    protected Masa masa;

    public Comanda(Masa masa) {
        this.masa = masa;
    }

    public abstract void executa();
}
