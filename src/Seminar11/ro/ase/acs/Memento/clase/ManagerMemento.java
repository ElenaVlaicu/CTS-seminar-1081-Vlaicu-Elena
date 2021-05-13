package Seminar11.ro.ase.acs.Memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMemento {

    private List<Mementi> mementoList;

    public ManagerMemento() {
        this.mementoList = new ArrayList<>();
    }

    public void adaugaMemento(Mementi memento){
        mementoList.add(memento);
    }

    public Mementi cereMemento(int index){
        if(index<mementoList.size() && index>=0){
            return mementoList.get(index);
        }
        return null;
    }

    public Mementi cereUltimulMemento(){
        return mementoList.get(mementoList.size()-1);
    }
}
