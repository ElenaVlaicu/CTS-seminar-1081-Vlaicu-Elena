package Seminar9.acs.ase.ro.claseFlyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory implements Flyweight{

    //relatie has a = factory constine o colectie de obiecte flyweight
    //cheia este nr de tel
    private HashMap<String, Flyweight> clienti;

    public FlyweightFactory() {
        this.clienti = new HashMap<>();
    }

    public Flyweight getFlyweight(String telefon){ //puteam sa l numesc si getClient dar in general mai bn asa
        //in realitate ar fi: daca sunam si am mai fost clienti, o sa zica "cu nr asta de tel?"
        if(clienti.containsKey(telefon)){
            return clienti.get(telefon);
        }
        else {
            //daca e prima oara cand suni, o sa zica "dati adresa/nr de tel" si apoi se va salva
            Client client = new Client("Marcel", "0987654", "marcel@yahoo.com");
            //facem ceva o functie ca sa obtinem telu si mailu ca sa nu hardcodam
            clienti.put(telefon, client);
            return client; //(sau return clienti.get(telefon)
        }
    }

    @Override
    public void printeazaRezervare(Rezervare rezervare) {

    }
}
