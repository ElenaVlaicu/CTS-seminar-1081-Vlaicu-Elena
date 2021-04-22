package Seminar9.acs.ase.ro.Program;

import Seminar9.acs.ase.ro.claseCommand.*;

public class ProgramCommand {

    public static void main(String[] args) {
        Masa masa = new Masa(1);
        Masa masa1 = new Masa(13);

        Comanda comandaRezervare = new ComandaRezervare(masa);
        Comanda comandaOcupare = new ComandaOcupare(masa1);
        Comanda comandaOcupare1 = new ComandaOcupare(masa1);

        Operator operator = new Operator();
        operator.invoca(comandaOcupare);
        operator.invoca(comandaOcupare1);
        operator.executaComanda();
        operator.invoca(comandaRezervare);

        operator.executaComanda();
        operator.executaComanda();

    }
}
