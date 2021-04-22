package Seminar9.acs.ase.ro.claseCommand;

public class ComandaOcupare extends Comanda{

    public ComandaOcupare(Masa masa) {
        super(masa);
    }

    @Override
    public void executa() {
        super.masa.ocupaMasa();
    }
}
