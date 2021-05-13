package Seminar11.ro.ase.acs.Memento;

import Seminar11.ro.ase.acs.Memento.clase.ManagerMemento;
import Seminar11.ro.ase.acs.Memento.clase.Meci;

public class Main {
    public static void main(String[] args) {

        Meci meci = new Meci("EchipaGazda", "EchipaOaspeti", 300, 100, 20, 20);
        meci.creazaMemento();

        ManagerMemento manager = new ManagerMemento();
        meci.creazaMemento();

        meci.setNrSpectatori(111);
        manager.adaugaMemento(meci.creazaMemento());

        System.out.println(meci.toString());
        meci.seteazaMemento(manager.cereMemento(0));

        System.out.println(meci.toString());
        meci.seteazaMemento(manager.cereUltimulMemento());
        System.out.println(meci.toString());


    }
}
