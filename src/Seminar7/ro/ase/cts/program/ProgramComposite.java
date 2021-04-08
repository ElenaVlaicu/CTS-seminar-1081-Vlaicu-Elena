package Seminar7.ro.ase.cts.program;

import Seminar7.ro.ase.cts.claseComposite.CompositeAgentie;
import Seminar7.ro.ase.cts.claseComposite.ISediu;
import Seminar7.ro.ase.cts.claseComposite.LeafFiliala;
import Seminar7.ro.ase.cts.claseProxy.Moneda;
import Seminar7.ro.ase.cts.claseProxy.OperatorCredite;
import Seminar7.ro.ase.cts.claseProxy.OperatorCrediteProxy;

public class ProgramComposite {

    public static void main(String[] args) {

        CompositeAgentie compositeAgentie = new CompositeAgentie();
        CompositeAgentie compositeAgentie1 = new CompositeAgentie();
        CompositeAgentie compositeAgentie2 = new CompositeAgentie();

        LeafFiliala filiala = new LeafFiliala("A");
        LeafFiliala filiala1 = new LeafFiliala("B");
        LeafFiliala filiala2 = new LeafFiliala("C");
        LeafFiliala filiala3 = new LeafFiliala("D");

        compositeAgentie.adaugaNod(filiala);
        compositeAgentie.adaugaNod(filiala1);
        compositeAgentie.adaugaNod(compositeAgentie2); //!!

        compositeAgentie1.adaugaNod(filiala3);
        compositeAgentie2.adaugaNod(filiala2);

        compositeAgentie.afiseazaDescriere();
        System.out.println();
        compositeAgentie2.afiseazaDescriere();

        compositeAgentie.stergeNod(filiala);

    }
}
