package Seminar11.ro.ase.acs.Observer;

import Seminar11.ro.ase.acs.Observer.clase.Client;
import Seminar11.ro.ase.acs.Observer.clase.Manager;


public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        Client client = new Client("Viorel");
        Client client1 = new Client("Dan");
        Client client2 = new Client("Razvan");

        manager.adaugaObservator(client);
        manager.adaugaObservator(client1);
        manager.adaugaObservator(client2);

        manager.anuntaMeci("volei");

        manager.stergeObservator(client);

        manager.anuntaMeci("fotbal");


    }
}
