package Seminar6.ro.ase.cts.program;

import Seminar6.ro.ase.cts.clase.Rezervare;
import Seminar6.ro.ase.cts.clase.RezervareBuilder;
import Seminar6.ro.ase.cts.clase.RezervareBuilderV2;

public class Program {

    public static void main(String [] args) {
        Rezervare rezervare1;

        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        rezervareBuilder.setCodRezervare(12).setAreMancare(true);
        rezervare1 = rezervareBuilder.build();

        Rezervare rezervare2 = new RezervareBuilder(4).setAreScaunErgonimic(false).build();

        Rezervare rezervare3 = new Rezervare(103, false, true, false, true, "pop");

        Rezervare rezervare4 = rezervareBuilder.setCodRezervare(800).setAreMuzicaAmbientala(true).build();
        //mancarea o sa fie true iar codul o sa fie 800 la ambele, pt ca il fol pe cel de pe linia 11
        //si teoretic am facut un shallow copy

        System.out.println(rezervare1);
        System.out.println(rezervare2);
        System.out.println(rezervare3);
        System.out.println(rezervare4);

        RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreMuzicaAmbientala(true);
        Rezervare rezervare5 = rezervareBuilderV2.setCodRezervare(1111).build();
        Rezervare rezervare6 = rezervareBuilderV2.setCodRezervare(1112).build();

    }
}
