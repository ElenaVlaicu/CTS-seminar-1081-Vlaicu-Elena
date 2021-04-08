package Seminar7.ro.ase.cts.program;

import Seminar7.ro.ase.cts.claseFacade.FacadeVerificatorPersoane;
import Seminar7.ro.ase.cts.claseFacade.Persoana;
import Seminar7.ro.ase.cts.claseProxy.Moneda;
import Seminar7.ro.ase.cts.claseProxy.OperatorCredite;
import Seminar7.ro.ase.cts.claseProxy.OperatorCrediteProxy;

public class ProgramProxy {

    public static void main(String[] args) {
        OperatorCredite operatorCredite = new OperatorCredite();
        operatorCredite.creareCredit(Moneda.EUR, 455.5f); //poate oferi in euro

        OperatorCrediteProxy proxy = new OperatorCrediteProxy(operatorCredite);
        proxy.creareCredit(Moneda.EUR, 333.2f); //nu poate oferi in euro
        proxy.creareCredit(Moneda.RON, 10000.2f);


    }
}
