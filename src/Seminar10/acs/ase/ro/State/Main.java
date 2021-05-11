package Seminar10.acs.ase.ro.State;

import Seminar10.acs.ase.ro.State.clase.Masa;

public class Main {
    public static void main(String[] args) {

        Masa masa = new Masa(5);
        Masa masa1 = new Masa(54);
        Masa masa2 = new Masa(53);
        masa.ocupaMasa();
        masa1.rezervaMasa();
        masa.rezervaMasa();
        masa2.rezervaMasa();
        masa.elibereazaMasa();
        masa.rezervaMasa();
    }
}
