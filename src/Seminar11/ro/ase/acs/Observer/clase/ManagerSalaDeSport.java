package Seminar11.ro.ase.acs.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {

    private List<Observer> observatori;

    public ManagerSalaDeSport() {
        this.observatori = new ArrayList<>();
    }

    public void adaugaObservator(Observer observator){
        observatori.add(observator);
    }

    public void stergeObservator(Observer observator){
        observatori.remove(observator);
    }

    public void notificaObservator(String mesaj){
        for(Observer o: observatori){
            o.primesteMesaj(mesaj);
        }
    }
}
