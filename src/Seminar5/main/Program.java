package Seminar5.main;

import Seminar5.clase.Asistent;
import Seminar5.clase.FactoryPersonal;
import Seminar5.clase.PersonalSpital;
import Seminar5.clase.TipPersonal;

public class Program {

    public static void main(String [] args) {
        FactoryPersonal factoryPersonal = new FactoryPersonal();
        //Asistent asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "asistentPrincipal");
        PersonalSpital asistent = factoryPersonal.createPersonal(TipPersonal.Asistent, "asistentPrincipal");
        PersonalSpital asistent1 = factoryPersonal.createPersonal(TipPersonal.Asistent, "asistentSecundar");

        System.out.println(asistent.toString());
        System.out.println(asistent1.toString());
    }
}
