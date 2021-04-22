package Seminar9.acs.ase.ro.ProgramFlyweight;

import Seminar9.acs.ase.ro.claseFlyweight.Client;
import Seminar9.acs.ase.ro.claseFlyweight.Flyweight;
import Seminar9.acs.ase.ro.claseFlyweight.FlyweightFactory;
import Seminar9.acs.ase.ro.claseFlyweight.Rezervare;

public class ProgramFlyWeight {

    public static void main(String[] args) {

        Rezervare rezervare1 = new Rezervare(10, 4, 3);
        Rezervare rezervare2 = new Rezervare(101, 3, 13);
        Rezervare rezervare3 = new Rezervare(102, 4, 3);
        Rezervare rezervare4 = new Rezervare(104, 8, 12);
        Rezervare rezervare5 = new Rezervare(108, 5, 17);

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight client = flyweightFactory.getFlyweight("76543");
        client.printeazaRezervare(rezervare1);

        flyweightFactory.getFlyweight("76543").printeazaRezervare(rezervare2);
        flyweightFactory.getFlyweight("1111111").printeazaRezervare(rezervare3);
        flyweightFactory.getFlyweight("1111111").printeazaRezervare(rezervare4);

    }
}
