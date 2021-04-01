package Seminar6.ro.ase.cts.program;

import Seminar6.ro.ase.cts.Adapter.clase.Bilet;
import Seminar6.ro.ase.cts.Adapter.clase.BiletAdapterClase;
import Seminar6.ro.ase.cts.Adapter.clase.BiletAdaptor;
import Seminar6.ro.ase.cts.Adapter.clase.IBiletOnline;

public class ProgramAdaptor {

    private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet){
        bilet.vanzare();
        bilet.rezervare();
    }

    private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet){
        bilet.rezervaBiletOnline();
        bilet.vindeBiletOnline();
    }

    public static void main(String[] args) {

        Bilet bilet = new Bilet(30f);
        rezervaSiAfiseazaBiletLaCasa(bilet);

        IBiletOnline adaptor = new BiletAdaptor(bilet);
        rezervaSiAfiseazaBiletOnline(adaptor);

        IBiletOnline adapterClase = new BiletAdapterClase(50);
        rezervaSiAfiseazaBiletOnline(adapterClase);
    }
}
