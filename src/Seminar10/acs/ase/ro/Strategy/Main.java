package Seminar10.acs.ase.ro.Strategy;

import Seminar10.acs.ase.ro.Strategy.clase.Client;
import Seminar10.acs.ase.ro.Strategy.clase.PlataCard;
import Seminar10.acs.ase.ro.Strategy.clase.PlataCash;

public class Main {
    public static void main(String[] args) {

        Client client = new Client("Marcel");

        PlataCard plataCard = new PlataCard();
        PlataCash plataCash = new PlataCash();

        client.executaPlata(200); //default va plati cash
        client.setTipPlata(plataCard);
        client.executaPlata(300);

    }
}
