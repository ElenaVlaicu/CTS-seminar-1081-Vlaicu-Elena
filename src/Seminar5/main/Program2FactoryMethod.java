package Seminar5.main;

import Seminar5.FactoryMethod.clase.*;

public class Program2FactoryMethod {

    public static void afisareInformatiiPersonalSpital(IFactory factory, String name){
        PersonalSpital personalSpital = factory.getPersonal(name);
        System.out.println(personalSpital.toString());
    }

    public static void main(String [] args) {
      afisareInformatiiPersonalSpital(new FactoryAsistent(), "Mircea");
      afisareInformatiiPersonalSpital(new FactoryMedic(), "Mihai");
      afisareInformatiiPersonalSpital(new FactoryInfirmier(), "Marian");
    }
}
